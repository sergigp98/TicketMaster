/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketmaster;

/**
 *
 * @author Usuario DAM 2
 */
public class Localidad {

    private String localidad;
    private int id;

    public Localidad(String localidad, int id) {
        this.localidad = localidad;
        this.id = id;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
