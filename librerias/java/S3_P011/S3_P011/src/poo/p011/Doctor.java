/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.p011;

/**
 *
 * @author Black Dragon
 */
public class Doctor extends Datos
{

    private String especialidad;
    private String cedula;

    public Doctor()
    {
        this.especialidad = null;
        this.cedula = null;
    }

    public Doctor(String especialidad, String cedula)
    {
        this.especialidad = especialidad;
        this.cedula = cedula;
    }

    /**
     * @return the especialidad
     */
    public String getEspecialidad()
    {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(String especialidad)
    {
        this.especialidad = especialidad;
    }

    /**
     * @return the cedula
     */
    public String getCedula()
    {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula)
    {
        this.cedula = cedula;
    }

    public Doctor(String especialidad, String cedula, String nombre, String direccion, String telefono, String correo)
    {
        super(nombre, direccion, telefono, correo);
        this.especialidad = especialidad;
        this.cedula = cedula;
    }
    
    
    

    @Override
    public String desp()
    {
        return super.desp() + "Cedula: " + cedula
                + "\nEspecialidad: " + especialidad;
    }

    @Override
    public void cambia(String nvo)
    {
        especialidad=nvo;
    }
    
    
    
}
