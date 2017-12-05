/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class Categoria {

    private String nombre;
    private Float SueldoBasico;
    private Float ValorHoraExtra;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getSueldoBasico() {
        return SueldoBasico;
    }

    public void setSueldoBasico(Float SueldoBasico) {
        this.SueldoBasico = SueldoBasico;
    }

    public Float getValorHoraExtra() {
        return ValorHoraExtra;
    }

    public void setValorHoraExtra(Float ValorHoraExtra) {
        this.ValorHoraExtra = ValorHoraExtra;
    }
}
