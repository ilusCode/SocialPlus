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
public class Prb
{

    public static void main(String[] args)
    {
       // Datos obj = new Datos();
        Datos arr [] = new Datos[5];
        Paciente p=new Paciente();
        Datos pa = new Paciente();
        ((Paciente)p).desp(); //Cast para ver las propiedaddes de Paciente.
        Paciente p2=(Paciente)p; //Variable que hace Cast de paciente declarado de Datos lo vea como Paciente y lo copie en p2.
        Datos dc = new Doctor();
        /*if(x instanceof Paciente){ //Saber como fue instanciado originalmente el objeto x
    
        }*/
        //Datos s = new Integer(5);
        arr[0] = new Datos("Alfredo", "Av. Independencia", "72312311", "alaskdsh@hotmail.com") {
            @Override
            public void cambia(String nvo)
            {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        arr[1] = new Datos("Marcos", "Av. López Mateos", "34332423", "asfds@hotmail.com") {
            @Override
            public void cambia(String nvo)
            {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        arr[2] = new Datos("Rosa", "Av. Mirasol", "665545467", "asadh@hotmail.com") {
            @Override
            public void cambia(String nvo)
            {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        arr[3] = new Datos("Angeles", "Calle Benito Juárez", "423423543", "wqewqd@hotmail.com") {
            @Override
            public void cambia(String nvo)
            {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        arr[4] = new Datos("Crisóforo", "Av. Gónzalez Ortega", "213435434", "safdfg@hotmail.com") {
            @Override
            public void cambia(String nvo)
            {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        ManipulaArchivos.guarda(arr);
        for (Datos arr1 : arr)
        {
            System.out.println(arr1.desp());
            Math.random();
        }
    }
}
