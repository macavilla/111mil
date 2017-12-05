/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import interfaces.Cobrador;
import java.util.ArrayList;

public class Contratista implements Cobrador {

    private String CUIT;
    private ArrayList<Float> trabajos = new ArrayList<>();

    @Override
    public String getId() {
        return CUIT;
    }

    public String getCUIT() {
        return CUIT;
    }

    public void setCUIT(String CUIT) {
        this.CUIT = CUIT;
    }

    public ArrayList<Float> getTrabajos() {
        return trabajos;
    }

    public void setTrabajos(ArrayList<Float> trabajos) {
        this.trabajos = trabajos;
    }

    @Override
    public Float totalDelMes() {
        Float total = 0f;

        for (int i = 0; i < trabajos.size(); i++) {
            total += this.trabajos.get(i);
        }
        return total;
    }

    public void agregarTrabajo(Float monto) {
        trabajos.add(monto);
    }

}
