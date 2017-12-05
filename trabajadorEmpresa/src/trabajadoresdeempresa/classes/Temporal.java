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
public class Temporal extends Empleado {

    private float montoQuincena;

    @Override
    public float totalDelMes() {
        float sueldo;
        sueldo = montoQuincena * 2;
        return sueldo;
    }

}
