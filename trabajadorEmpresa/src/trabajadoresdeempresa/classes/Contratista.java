/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajadoresdeempresa.classes;

import trabajadoresdeempresa.interfaces.Cobrador;

/**
 *
 * @author AULA1
 */
public class Contratista implements Cobrador {

    private String cuil;

    public float totalDelMes() {

        return 0;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }
}//fin de clase
