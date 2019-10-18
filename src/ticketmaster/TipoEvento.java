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
public class TipoEvento {

    private String tipoEvento;
    private int id;

    public TipoEvento(String tipoEvento, int id) {
        this.tipoEvento = tipoEvento;
        this.id = id;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
