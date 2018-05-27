/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.p011;

import poo.p012.Lecturas;

/**
 *
 * @author Black Dragon
 */
public class ManipulaDatos
{

    public static String cedula, especialidad, enfermedad;
    public static int edad;

    public static int pintaMenu(String[] mnu)
    {
        System.out.println("\n\t\t==MENÚ==\n");
        for (int i = 0; i < mnu.length; i++)
        {
            System.out.println("[" + (i + 1) + "] " + mnu[i]);
        }
        System.out.print("\nElige una opción: ");
        return Lecturas.entero(true);
    }

    public static Datos[] inserta(Datos[] arr, Datos obj)
    {
        Datos[] nvo = null;
        if (arr == null)
        {
            nvo = new Datos[1];
            nvo[0] = obj;
        } else
        {
            nvo = new Datos[arr.length + 1];
            System.arraycopy(arr, 0, nvo, 0, arr.length);
            nvo[arr.length] = obj;
        }
        return nvo;
    }

    public static String consulta(Datos[] d, int opc)
    {
        String s = "";
        if (d != null)
        {
            for (int i = 0; i < d.length; i++)
            {
                if (opc == 1 && d[i] instanceof Paciente)
                {
                    d[i].cambia("16");
                    s += d[i].desp();
                } else
                {
                    if (opc == 2 && d[i] instanceof Doctor)
                    {
                        d[i].cambia("General");
                        s += d[i].desp();
                    }
                }
            }
        } else
        {
            return "No hay datos.";
        }
        return s;
    }

    public static Datos creaObj(int opc)
    {

        String nombre, direccion, telefono, correo;
        System.out.print("Dame el nombre: ");
        nombre = Lecturas.cadena();
        System.out.print("Dame la dirección: ");
        direccion = Lecturas.cadena();
        System.out.print("Dame el teléfono: ");
        telefono = Lecturas.cadena();
        System.out.print("Dame el correo: ");
        correo = Lecturas.cadena();
        if (opc == 1)
        {
            System.out.print("Enfermedad: ");
            enfermedad = Lecturas.cadena();
            System.out.print("Edad: ");
            edad = Lecturas.entero();
            return new Paciente(edad, enfermedad, nombre, direccion, telefono, correo);
        } else
        {
            System.out.print("Especialidad: ");
            especialidad = Lecturas.cadena();
            System.out.print("Cédula: ");
            cedula = Lecturas.cadena();
            return new Doctor(especialidad, cedula, nombre, direccion, telefono, correo);
        }
    }

    public static int busca(Datos[] d, String s, int opc)
    {
        if (d != null)
        {
            for (int i = 0; i < d.length; i++)
            {
                if (opc == 1 && d[i] instanceof Paciente)
                {
                    if (d[i].getNombre().equals(s))
                    {
                        return i;
                    }

                } else if (opc == 2 && d[i] instanceof Doctor)
                {
                    if (d[i].getNombre().equals(s))
                    {
                        return i;
                    }

                }

            }
        } else
        {
            System.out.println("No hay datos o no se encontro el dato.");
            return -1;
        }
        return -1;
    }

    //Datos 
    public static Datos[] elimina(Datos[] d, int p)
    {
        if (d.length == 1 && p == 0)
        {
            return null;
        } else
        {
            int j = 0;
            Datos[] nvo = new Datos[d.length - 1];
            for (int i = 0; i < d.length; i++)
            {
                if (p != 1)
                {
                    nvo[j] = d[i];
                    j++;
                }
            }
            return nvo;
        }
    }
}
