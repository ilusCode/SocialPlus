package poo.p011;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/**
 *
 * @author Black Dragon
 */
public class ManipulaArchivos
{

    public static void guarda(Datos[] d)
    {
        try
        {
            FileOutputStream fost = new FileOutputStream("Datos/archivo.dat");
            try
            {
                ObjectOutputStream arch = new ObjectOutputStream(fost);
                for (int i = 0; i < d.length; i++)
                {
                    arch.writeObject(d[i]);
                }
                arch.close();
            } catch (IOException ex)
            {
                //Logger.getLogger(ManipulaArchivos.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Error de entrada y salida");
            }
        } catch (FileNotFoundException ex)
        {
            // Logger.getLogger(ManipulaArchivos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Archivo no encontrado");
        }
    }

    public static Datos[] carga()
    {
        Datos[] nvo = null;
        try
        {
            FileInputStream fost = new FileInputStream("Datos/archivo.dat");
            try
            {
                ObjectInputStream arch = new ObjectInputStream(fost);

                Datos obj = new Datos() {
                    @Override
                    public void cambia(String nvo)
                    {
                        //METODO CAMBIA
                    }
                };
                do
                {
                    obj = null;
                    obj = (Datos) arch.readObject();
                    nvo = ManipulaDatos.inserta(nvo, obj);
                } while (true);

            } catch (IOException ex)
            {
                //System.out.println("Error "+ex.getMessage());
                //Logger.getLogger(ManipulaArchivos.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Problemas de entrada y salida");
            } catch (ClassNotFoundException ex)
            {
                //Logger.getLogger(ManipulaArchivos.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("No encontro el la clase");
            } catch (Exception ex)
            {
                System.out.println("Error..." + ex.getMessage());
            }
        } catch (FileNotFoundException ex)
        {
            System.out.println("No se puede abrir el archivo");
        } catch (Exception ex)
        {
            System.out.println("Error..." + ex.getMessage());
        }
        return nvo;
    }
}
