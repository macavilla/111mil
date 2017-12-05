/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajadoresdeempresa.classes;

/**
 *
 * @author AULA1
 */
public class Categoria extends Empleado {

    private String descripcion;
    private float sueldoBasico;
    private float montoHorasExtras;
    private float horasExtra;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(float sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public float getMontoHorasExtras() {
        return montoHorasExtras;
    }

    public void setMontoHorasExtras(float montoHorasExtras) {
        this.montoHorasExtras = montoHorasExtras;
    }

    public float totalMes(float horas) {
        return sueldoBasico + horas * montoHorasExtras;
    }

    public float totalDelMes() {
        float sueldoSegunCategoria;

        sueldoSegunCategoria = sueldoBasico + montoHorasExtras * horasExtra;
        return sueldoSegunCategoria;

    }

}
