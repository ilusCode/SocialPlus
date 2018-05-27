/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Perdomo
 */
public class Evento {
    private int folio;
    private String f_evento;
    private String f_inico;
    private String f_devolucion;
    private String deposito;
    private int descu;
    private int cantidad;

    public Evento() {
    }

    public Evento(int folio, String f_evento, String f_inico, String f_devolucion, String deposito, int descu, int cantidad) {
        this.folio = folio;
        this.f_evento = f_evento;
        this.f_inico = f_inico;
        this.f_devolucion = f_devolucion;
        this.deposito= deposito;
        this.descu = descu;
        this.cantidad = cantidad;
    }

    /**
     * @return the folio
     */
    public int getFolio() {
        return folio;
    }

    /**
     * @param folio the folio to set
     */
    public void setFolio(int folio) {
        this.folio = folio;
    }

    /**
     * @return the f_evento
     */
    public String getF_evento() {
        return f_evento;
    }

    /**
     * @param f_evento the f_evento to set
     */
    public void setF_evento(String f_evento) {
        this.f_evento = f_evento;
    }

    /**
     * @return the f_inico
     */
    public String getF_inico() {
        return f_inico;
    }

    /**
     * @param f_inico the f_inico to set
     */
    public void setF_inico(String f_inico) {
        this.f_inico = f_inico;
    }

    /**
     * @return the f_devolucion
     */
    public String getF_devolucion() {
        return f_devolucion;
    }

    /**
     * @param f_devolucion the f_devolucion to set
     */
    public void setF_devolucion(String f_devolucion) {
        this.f_devolucion = f_devolucion;
    }

    /**
     * @return the descu
     */
    public int getDescu() {
        return descu;
    }

    /**
     * @param descu the descu to set
     */
    public void setDescu(int descu) {
        this.descu = descu;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the deposito
     */
    public String getDeposito() {
        return deposito;
    }

    /**
     * @param deposito the deposito to set
     */
    public void setDeposito(String deposito) {
        this.deposito = deposito;
    }
    
    
}
