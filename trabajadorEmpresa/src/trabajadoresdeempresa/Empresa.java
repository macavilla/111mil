/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajadoresdeempresa;

import trabajadoresdeempresa.classes.Categoria;
import trabajadoresdeempresa.classes.DePlanta;

/**
 *
 * @author AULA1
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Categoria aprendiz = new Categoria();
        aprendiz.setDescripcion("aprendiz");
        aprendiz.setSueldoBasico(5000);
        aprendiz.setMontoHorasExtras(0);
        aprendiz.setApellido("Perez");
        aprendiz.setNombre("Juan");
        aprendiz.setDireccion("Calle 123");
        aprendiz.setDni("35000000");
        aprendiz.setTelefono("0303456");

        Categoria experto = new Categoria();
        experto.setDescripcion("experto");
        experto.setSueldoBasico(10000);
        experto.setMontoHorasExtras(500);
        experto.setApellido("Gómez");
        experto.setNombre("Luis");
        experto.setDireccion("Calle 456");
        experto.setDni("32000000");
        experto.setTelefono("4815163242");

        Categoria estandar = new Categoria();
        estandar.setDescripcion("estandar");
        estandar.setSueldoBasico(7000);
        estandar.setMontoHorasExtras(300);
        estandar.setApellido("Rodriguez");
        estandar.setNombre("Maria");
        estandar.setDireccion("Calle 789");
        estandar.setDni("38000000");
        estandar.setTelefono("456987123");

    }//fin main

} //fin clase empresa
