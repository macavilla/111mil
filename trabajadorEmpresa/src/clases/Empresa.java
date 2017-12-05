/*opciones totalempresa (te),totaltrabajador(tt) solicita dni o cuit, 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import interfaces.Cobrador;
import java.util.ArrayList;

public class Empresa {

    private String razonSocial;
    private String cuit;
    private ArrayList<Cobrador> trabajadores = new ArrayList<>();

    public Float calcularTotalAPagar() {
        float total = 0;

        for (int i = 0; i < trabajadores.size(); i++) {
            total += trabajadores.get(i).totalDelMes();
        }
        return total;
    }

    public Float montoXEmpleado(String id) {

        for (int i = 0; i < trabajadores.size(); i++) {
            if (id.equals(trabajadores.get(i).getId())) {
                return trabajadores.get(i).totalDelMes();
            }
        }
        return 0f;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public ArrayList<Cobrador> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(ArrayList<Cobrador> trabajadores) {
        this.trabajadores = trabajadores;
    }

    public void agregarTrabajador(Cobrador trabajador) {
        this.trabajadores.add(trabajador);
    }
}
