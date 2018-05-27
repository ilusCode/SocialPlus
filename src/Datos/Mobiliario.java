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
public class Mobiliario {
    private int idmob;
    private String descripcion;
    private int nexistencia;
    private double precio;
    private double p_uni;
    private String provedor;    

    public Mobiliario() {
    }

    public Mobiliario(int idmob, String descripcion, int nexistencia, double precio, double p_uni, String provedor) {
        this.idmob = idmob;
        this.descripcion = descripcion;
        this.nexistencia = nexistencia;
        this.precio = precio;
        this.p_uni = p_uni;
        this.provedor = provedor;
    }

    /**
     * @return the idmob
     */
    public int getIdmob() {
        return idmob;
    }

    /**
     * @param idmob the idmob to set
     */
    public void setIdmob(int idmob) {
        this.idmob = idmob;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the nexistencia
     */
    public int getNexistencia() {
        return nexistencia;
    }

    /**
     * @param nexistencia the nexistencia to set
     */
    public void setNexistencia(int nexistencia) {
        this.nexistencia = nexistencia;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the p_uni
     */
    public double getP_uni() {
        return p_uni;
    }

    /**
     * @param p_uni the p_uni to set
     */
    public void setP_uni(double p_uni) {
        this.p_uni = p_uni;
    }

    /**
     * @return the provedor
     */
    public String getProvedor() {
        return provedor;
    }

    /**
     * @param provedor the provedor to set
     */
    public void setProvedor(String provedor) {
        this.provedor = provedor;
    }
}
