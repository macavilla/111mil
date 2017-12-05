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
public class DePlanta extends Empleado {

    private float horasExtra;
    private Categoria categoria;

    @Override
    public float totalDelMes() {

        return categoria.totalMes(horasExtra);

    }

    public float getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(float horasExtra) {
        this.horasExtra = horasExtra;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

}
