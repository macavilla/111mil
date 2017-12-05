/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import clases.Categoria;
import clases.Contratista;
import clases.EmpleadoTemporal;
import clases.Empresa;
import clases.EmpleadoPlanta;
import java.util.Scanner;

public class AplicacionSueldoTrabajadores {

    public static void main(String[] args) {

        //Se Crean las Categorias de los empleados de planta
        Categoria aprendiz = new Categoria();
        Categoria estandard = new Categoria();
        Categoria experto = new Categoria();

        aprendiz.setNombre("aprendiz");
        aprendiz.setSueldoBasico(300f);
        aprendiz.setValorHoraExtra(0f);

        estandard.setNombre("estandar");
        estandard.setSueldoBasico(10000f);
        estandard.setValorHoraExtra(300f);

        experto.setNombre("experto");
        experto.setSueldoBasico(20000f);
        experto.setValorHoraExtra(500f);
        
        // carga contratista1
        Contratista contratista1 = new Contratista();
        contratista1.setCUIT("20-11222333-3");
        contratista1.agregarTrabajo(1000f);
        contratista1.agregarTrabajo(500f);
        contratista1.agregarTrabajo(700f);

        // carga contratista2
        Contratista contratista2 = new Contratista();
        contratista2.setCUIT("21-44555666-8");
        contratista2.agregarTrabajo(700f);
        contratista2.agregarTrabajo(1200f);

        //empleado temporal
        EmpleadoTemporal empleadoTemporal = new EmpleadoTemporal();
        empleadoTemporal.setMontoQuincenal(5000f);
        empleadoTemporal.setApellido("Pepelepu");
        empleadoTemporal.setDni("123456789");

         
        EmpleadoPlanta empleadoDePlanta1 = new EmpleadoPlanta();
        empleadoDePlanta1.setCategoria(aprendiz);
        empleadoDePlanta1.setHorasExtras(20.5f);
        empleadoDePlanta1.setApellido("Perez");
        empleadoDePlanta1.setDni("43546345");
        
        EmpleadoPlanta empleadoDePlanta2 = new EmpleadoPlanta();
        empleadoDePlanta2.setCategoria(estandard);
        empleadoDePlanta2.setHorasExtras(1.5f);
        empleadoDePlanta2.setApellido("Lopez");
        empleadoDePlanta2.setDni("76543123");
        
        EmpleadoPlanta empleadoDePlanta3 = new EmpleadoPlanta();
        empleadoDePlanta3.setCategoria(experto);
        empleadoDePlanta3.setHorasExtras(2.5f);
        empleadoDePlanta3.setApellido("Suarez");
        empleadoDePlanta3.setDni("12345976");

        Empresa empresa1 = new Empresa();

        empresa1.setCuit("28-26805190-7");
        empresa1.setRazonSocial("Empresa de Trabajadores");
        empresa1.agregarTrabajador(empleadoTemporal);
        empresa1.agregarTrabajador(empleadoDePlanta1);
        empresa1.agregarTrabajador(empleadoDePlanta2);
        empresa1.agregarTrabajador(empleadoDePlanta3);
        empresa1.agregarTrabajador(contratista1);
        empresa1.agregarTrabajador(contratista2);

        //para probar imprimo cual es el sueldo de cada trabajador
        System.out.println("el total de empleadoTemporal1 es : " + empleadoTemporal.totalDelMes());
        System.out.println("el total de empleadoDePlanta1 es : " + empleadoDePlanta1.totalDelMes());
        System.out.println("el total de empleadoDePlanta2 es : " + empleadoDePlanta2.totalDelMes());
        System.out.println("el total de empleadoDePlanta3 es : " + empleadoDePlanta3.totalDelMes());
        System.out.println("el total de contratista1 es : " + contratista1.totalDelMes());
        System.out.println("el total de contratista2 es : " + contratista2.totalDelMes());

        boolean salir = false;
        do {
            mensajeBienvenida();
            Scanner sc = new Scanner(System.in);
            String codigo = sc.nextLine();
            switch (codigo) {
                case "te":
                    //SDevuelve el total a pagar por la empresa 

                    System.out.println("El total a pagar es : " + empresa1.calcularTotalAPagar());
                    break;
                case "tt":
                    System.out.println("Ingrese id");
                    String id = sc.nextLine();
                    System.out.println("el empleado id " + id + " cobra " + empresa1.montoXEmpleado(id));
                    break;
                case "fin":
                    System.out.println("Esta seguro de terminar? S/N");
                    String quiereSalir = sc.nextLine();
                    if (quiereSalir.equals("s")) {
                        salir = true;
                    }
                    break;
                default:
                    System.out.println("Operación no válida");
                    break;
            }
        } while (salir == false);
 }

    public static void mensajeBienvenida() {
        System.out.println("\n*****************************************************");
        System.out.println("          Bienvenido al Sistema de pago");
        System.out.println("Ingrese Código de Operación: te tt  fin");
        System.out.println("*****************************************************");
    }
}