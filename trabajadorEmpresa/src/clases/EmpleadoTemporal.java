/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class EmpleadoTemporal extends Empleado {

    private Float montoQuincenal;

    public Float getMontoQuincenal() {
        return montoQuincenal;
    }

    public void setMontoQuincenal(Float montoQuincenal) {
        this.montoQuincenal = montoQuincenal;
    }

    @Override
    //sobreescribo el metodo que heredo de la superclase
    public Float totalDelMes() {
        return montoQuincenal * 2;
    }
}
