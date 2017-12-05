/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elmajestic;

import com.sun.xml.internal.ws.client.ContentNegotiation;
import elmajestic.classes.Cine;
import java.util.Scanner;

/**
 *
 * @author AULA1
 */
public class MiApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cine majestic = new Cine();
        String codigo;
        boolean quiereSalir = false;
        String titulo, genero;
        int numeroIdSala, cantAsientos;
        float precioEntrada;

        do {
            System.out.println("Ingrese el código que corresponda");
            System.out.println("AP -> Agregar película.");
            System.out.println("LP -> Listar película.");
            System.out.println("AS -> agregar una sala.");
            System.out.println("LS -> Listar salas.");
            System.out.println("FIN -> Salir de la app.");
            Scanner ingresoCodigo = new Scanner(System.in);
            codigo = ingresoCodigo.nextLine();

            switch (codigo) {
                case "AP":
                    System.out.println("-----------------");
                    System.out.println("Agregar película:");
                    System.out.println("Ingrese título:");
                    Scanner ingPelicula = new Scanner(System.in);
                    titulo = ingPelicula.nextLine();
                    System.out.println("Ingrese género");
                    Scanner ingGenero = new Scanner(System.in);
                    genero = ingGenero.nextLine();
                    majestic.agregarPelicula(titulo, genero);

                    break;
                case "LP":
                    System.out.println("Listar películas");
                    System.out.println("" + majestic.obtenerInfoPeliculas());
                    //imprime lista concatenada - modificar al final
                    break;
                case "AS":
                    System.out.println("Agregar sala");
                    System.out.println("Ingrese el número de ID de la sala:");
                    Scanner ingNumID = new Scanner(System.in);
                    numeroIdSala = ingNumID.nextInt();
                    System.out.println("Ingrese la cantidad de asientos de la sala " + numeroIdSala);
                    Scanner ingCantAsientos = new Scanner(System.in);
                    cantAsientos = ingCantAsientos.nextInt();
                    System.out.println("Ingrese el precio de entrada de sala " + numeroIdSala);
                    Scanner ingPrecioEntrada = new Scanner(System.in);
                    precioEntrada = ingPrecioEntrada.nextInt();

                    majestic.agregarSala(numeroIdSala, cantAsientos, precioEntrada);
                    break;
                case "LS":
                    System.out.println("Listar salas");
                    System.out.println(majestic.obtenerInfoSalas());
                case "FIN":
                    System.out.println("¿Desea salir? S/N");
                    //metodo
                    break;
                default:
                    System.out.println("Código inválido");
                    break;
            }
        } while (quiereSalir == false);

    }//fin main

}//fin clase ElMajestic
