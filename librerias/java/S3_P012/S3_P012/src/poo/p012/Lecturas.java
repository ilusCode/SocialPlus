/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.p012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Black Dragon
 */
public class Lecturas
{

    private static InputStreamReader isr = new InputStreamReader(System.in);
    private static BufferedReader br = new BufferedReader(isr);

    public static int entero()
    {
        boolean b = true;
        int x = 0;
        //Crea una excepciÃ³n y la manda al usuario
        do
        {
            try
            {
                x = Integer.parseInt(br.readLine());
                b = false;
            } catch (Exception ex)
            {
                System.out.print("Se esperaba un entero...intente nuevamente: ");
            }
        } while (b);
        return x;

    }

    public static int entero(boolean b)
    {
        try
        {
            return Integer.parseInt(br.readLine());
        } catch (IOException ex)
        {
            Logger.getLogger(Lecturas.class.getName()).log(Level.SEVERE, null, ex);//Crea archivo que muestra todo lo que pasa en el proceso
            System.out.println("Error el periférico no está activo");
        } catch (Exception ex)
        {
            System.out.println("Error... Se esperaba un entero");
        }
        return 0;
    }

    public static short Short()
    {
        boolean b = true;
        short x = 0;
        //Crea una excepciÃ³n y la manda al usuario
        do
        {
            try
            {
                x = Short.parseShort(br.readLine());
                b = false;
            } catch (Exception ex)
            {
                System.out.print("Se esperaba un short...intente nuevamente: ");
            }
        } while (b);
        return x;
    }

    public static short Short(boolean b)
    {
        try
        {
            return Short.parseShort(br.readLine());
        } catch (IOException ex)
        {
            Logger.getLogger(Lecturas.class.getName()).log(Level.SEVERE, null, ex);//Crea archivo que muestra todo lo que pasa en el proceso
            System.out.println("Error el periférico no está activo");
        } catch (Exception ex)
        {
            System.out.println("Error... Se esperaba un short");
        }
        return 0;
    }

    public static float flotante()
    {
        boolean b = true;
        float x = 0;
        //Crea una excepciÃ³n y la manda al usuario
        do
        {
            try
            {
                x = Float.parseFloat(br.readLine());
                b = false;
            } catch (Exception ex)
            {
                System.out.print("Se esperaba un flotante...intente nuevamente: ");
            }
        } while (b);
        return x;

    }

    public static float flotante(boolean b)
    {
        try
        {
            return Float.parseFloat(br.readLine());
        } catch (IOException ex)
        {
            Logger.getLogger(Lecturas.class.getName()).log(Level.SEVERE, null, ex);//Crea archivo que muestra todo lo que pasa en el proceso
            System.out.println("Error el periférico no está activo");
        } catch (Exception ex)
        {
            System.out.println("Error... Se esperaba un flotante");
        }
        return 0;
    }

    public static double doble()
    {
        boolean b = true;
        double x = 0;
        //Crea una excepciÃ³n y la manda al usuario
        do
        {
            try
            {
                x = Double.parseDouble(br.readLine());
                b = false;
            } catch (Exception ex)
            {
                System.out.print("Se esperaba un double...intente nuevamente: ");
            }
        } while (b);
        return x;

    }

    public static double doble(boolean b)
    {
        try
        {
            return Double.parseDouble(br.readLine());
        } catch (IOException ex)
        {
            Logger.getLogger(Lecturas.class.getName()).log(Level.SEVERE, null, ex);//Crea archivo que muestra todo lo que pasa en el proceso
            System.out.println("Error el periférico no está activo");
        } catch (Exception ex)
        {
            System.out.println("Error... Se esperaba un double");
        }
        return 0;
    }

    public static byte baite()
    {
        boolean b = true;
        byte x = 0;
        //Crea una excepciÃ³n y la manda al usuario
        do
        {
            try
            {
                x = Byte.parseByte(br.readLine());
                b = false;
            } catch (Exception ex)
            {
                System.out.print("Se esperaba un byte...intente nuevamente: ");
            }
        } while (b);
        return x;

    }

    public static byte baite(boolean b)
    {
        try
        {
            return Byte.parseByte(br.readLine());
        } catch (IOException ex)
        {
            Logger.getLogger(Lecturas.class.getName()).log(Level.SEVERE, null, ex);//Crea archivo que muestra todo lo que pasa en el proceso
            System.out.println("Error el periférico no está activo");
        } catch (Exception ex)
        {
            System.out.println("Error... Se esperaba un byte");
        }
        return 0;
    }

    public static long largo()
    {
        boolean b = true;
        long x = 0;
        //Crea una excepciÃ³n y la manda al usuario
        do
        {
            try
            {
                x = Long.parseLong(br.readLine());
                b = false;
            } catch (Exception ex)
            {
                System.out.print("Se esperaba un long...intente nuevamente: ");
            }
        } while (b);
        return x;

    }

    public static long largo(boolean b)
    {
        try
        {
            return Long.parseLong(br.readLine());
        } catch (IOException ex)
        {
            Logger.getLogger(Lecturas.class.getName()).log(Level.SEVERE, null, ex);//Crea archivo que muestra todo lo que pasa en el proceso
            System.out.println("Error el periférico no está activo");
        } catch (Exception ex)
        {
            System.out.println("Error... Se esperaba un long");
        }
        return 0;
    }

    public static String cadena()
    {
        try
        {
            return br.readLine();
        } catch (Exception ex)
        {
            Logger.getLogger(Lecturas.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("error: " + ex.getMessage());
        }
        return "";
    }

    public static char caracter()
    {
        char c = ' ';
        try
        {
            c = (char) br.read();
            String s = br.readLine();
        } catch (Exception ex)
        {
            Logger.getLogger(Lecturas.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("error: " + ex.getMessage());
        }
        return c;
    }
}
