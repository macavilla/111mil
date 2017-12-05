/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elmajestic.classes;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author AULA1
 */
public class Cine {

    private String nombre;
    private ArrayList<Pelicula> listaPelicula = new ArrayList<>();
    private ArrayList<Sala> listaSalas = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Pelicula> getListaPelicula() {
        return listaPelicula;
    }

    public void setListaPelicula(ArrayList<Pelicula> listaPelicula) {
        this.listaPelicula = listaPelicula;
    }
// ------------------ PELICULAS ------------------

    public void agregarPelicula(String titulo, String genero) {
        Pelicula unaPelicula = new Pelicula();
        unaPelicula.setTitulo(titulo);
        unaPelicula.setGenero(genero);

        listaPelicula.add(unaPelicula);
        System.out.println("Película agregada.");
    }

    public ArrayList<String> obtenerInfoPeliculas() {
        //creo un array listado, inicializo
        ArrayList<String> arrayPeliculas = new ArrayList<String>();
        // fore recorre un listado (en este caso listaPelicula) y los asigna a una nueva
        //pelicula de Clase Pelicula

        for (Pelicula pelicula : listaPelicula) {
            //agrego a listado cada pelicula recorrida, con getter obtengo los atributos de Pelicula
            arrayPeliculas.add(pelicula.getTitulo() + " - " + pelicula.getGenero());

        }

        return arrayPeliculas;
    }

    // ------------------ SALAS ------------------
    public void agregarSala(int numeroID, int cantAsientos, float precioEntrada) {
        Sala unaSala = new Sala();
        unaSala.setNumeroId(cantAsientos);
        unaSala.setCantAsientos(cantAsientos);
        unaSala.setPrecioEntrada(precioEntrada);

        listaSalas.add(unaSala);
        System.out.println("Sala agregada.");
    }

    public ArrayList<String> obtenerInfoSalas() {

        ArrayList arraySalas = new ArrayList<String>();

        for (Sala sala : listaSalas) {
            arraySalas.add("- Sala nº: " + sala.getNumeroId() + "  - Cantidad de asientos: "
                    + sala.getCantAsientos() + " - Precio entrada: " + sala.getPrecioEntrada());
        }
        return arraySalas;

    }

    public void agregarProyeccion(String horario, String pelicula, int numeroIdSala) {
        Proyeccion unaProyeccion = new Proyeccion();
        unaProyeccion.setHorario(horario);

    }

}//fin clase Cine
