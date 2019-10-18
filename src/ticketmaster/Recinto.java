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
public class Recinto {

    private String recintos;
    private int id;

    public Recinto(String recintos, int id) {
        this.recintos = recintos;
        this.id = id;
    }

    public String getRecintos() {
        return recintos;
    }

    public void setRecintos(String recintos) {
        this.recintos = recintos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
