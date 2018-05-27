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

public class Paciente extends Datos
{

    private int edad;
    private String enfermedad;

    public Paciente()
    {
        this.edad = 0;
        this.enfermedad = null;
    }

    public Paciente(int edad, String enfermedad)
    {
        this.edad = edad;
        this.enfermedad = enfermedad;
    }

    /**
     * @return the edad
     */
    public int getEdad()
    {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    /**
     * @return the enfermedad
     */
    public String getEnfermedad()
    {
        return enfermedad;
    }

    /**
     * @param enfermedad the enfermedad to set
     */
    public void setEnfermedad(String enfermedad)
    {
        this.enfermedad = enfermedad;
    }

    public Paciente(int edad, String enfermedad, String nombre, String direccion, String telefono, String correo)
    {
        super(nombre, direccion, telefono, correo);
        this.edad = edad;
        this.enfermedad = enfermedad;
    }
    
    
    

    @Override //método sobrepuesto
    public String desp()
    {
        return super.desp() + "Edad: " + edad
                + "\nEnfermedad: " + enfermedad;
    }

    @Override
    public void cambia(String nvo)
    {
        try{
            edad=Integer.parseInt(nvo);
        }catch(Exception ex){
            System.out.println("La edad no se modifico\n");
        }
    }
}
