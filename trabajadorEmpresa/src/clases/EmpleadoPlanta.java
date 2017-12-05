/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class EmpleadoPlanta extends Empleado {

    private Categoria categoria;
    private Float horasExtras;

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Float getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(Float horasExtras) {
        this.horasExtras = horasExtras;
    }

    @Override
    //sobreescribo el metodo que heredo de la superclase
    public Float totalDelMes() {
        Float total = categoria.getSueldoBasico() + categoria.getValorHoraExtra() * horasExtras;
        return total;
    }
}
