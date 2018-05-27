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
public class Cliente {
    private int idcli;
    private String nombre;
    private String direccion;
    private String ciudad;
    private int cp;
    private int tel;  

    public Cliente(int idcli, String nombre, String direccion, String ciudad, int cp, int tel) {
        this.idcli = idcli;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.cp = cp;
        this.tel = tel;
    }

    public Cliente() {
    }

    /**
     * @return the idcli
     */
    public int getIdcli() {
        return idcli;
    }

    /**
     * @param idcli the idcli to set
     */
    public void setIdcli(int idcli) {
        this.idcli = idcli;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the cp
     */
    public int getCp() {
        return cp;
    }

    /**
     * @param cp the cp to set
     */
    public void setCp(int cp) {
        this.cp = cp;
    }

    /**
     * @return the tel
     */
    public int getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(int tel) {
        this.tel = tel;
    }
}
