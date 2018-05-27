/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.p012;

/**
 *
 * @author Black Dragon
 */
public class Prb
{
    public static void main(String[] args)
    {
        int a, b;
        float d;
        double c;
        long e;
        short f;
        byte g;
      
        System.out.print("Dame un número entero: ");
        a = Lecturas.entero(true);
        System.out.print("Dame un número entero: ");
        b = Lecturas.entero(true);
        System.out.print("Dame un número flotante: ");
        d = Lecturas.flotante();
        System.out.print("Dame un número double: ");
        c = Lecturas.doble();
        System.out.print("Dame un número long: ");
        e = Lecturas.largo();
        System.out.print("Dame un número short: ");
        f = Lecturas.Short();
        System.out.print("Dame un número byte: ");
        g = Lecturas.baite();
       
        //System.out.println("Suma de a + b = " + (a+b));
        
    }
}