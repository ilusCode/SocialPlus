/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.p010;

/**
 *
 * @author Black Dragon
 */
public class Arreglos
{

    private char arr[] = null;

    public Arreglos()
    {
        arr = new char[3];
        arr[0] = 'a';
        arr[1] = 'b';
        arr[2] = 'c';

    }

    public Arreglos(char[] arr)  //Cuando se recibe un arreglo como parametro se debe poner primero el "[]".
    {
        this.arr = arr;
    }

    public Arreglos(int n)
    {
        arr = new char[n];
        inicializa();

    }

    public Arreglos(boolean b, char... arr)   //Recibe un "arreglo indefinido" con " ... " sin dimensión;
    //Un arreglo indefinido <<SIEMPRE>> va al final.
    //Java llena los arreglos con 0;
    {
        if (b == true)
        {
            this.arr = arr;
        }
    }

    /**
     * @return the arr
     */
    public char[] getArr()
    {
        return arr;
    }

    /**
     * @param arr the arr to set
     */
    public void setArr(char[] arr)
    {
        this.arr = arr;
    }

    //Método para inicializar arreglo con caracteres aleatorio y que no quede en blancos.
    private void inicializa()
    {
        for (int i = 0; i < arr.length; i++)
        {
            i = 0;
            do
            {
                int x = (int) (Math.random() * 100);
                if (x >= 32 && x <= 255)
                {
                    arr[i++] = (char) x;
                }
            } while (i < arr.length);
        }
    }

    public void desp1()
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("[" + (i+1) + "] = " + arr[i]);
        }
    }

    public void desp2()
    {
        for (char c : arr)
        {
            System.out.println(c);
        }
    }

    public void redimensiona(int ne)
    {
        if(ne>arr.length){
            char nuevo[] = new char[ne];
            System.arraycopy(arr, 0, nuevo, 0, arr.length);
            arr=nuevo;
        }
       
    }
}
