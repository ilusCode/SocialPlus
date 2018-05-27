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
public class Matrices
{

    private char[][][] mat = null;

    public Matrices()
    {
        mat = new char[3][3][3];
        inicializa2();
    }

    public Matrices(char[][][] arr)  //Cuando se recibe un arreglo como parametro se debe poner primero el "[]".
    {
        this.mat = arr;
    }

    public Matrices(int n)
    {
        mat = new char[n][n][n];
        inicializa2();
    }

    /**
     * @return the mat
     */
    public char[][][] getArr()
    {
        return mat;
    }

    /**
     * @param arr the mat to set
     */
    public void setArr(char[][][] arr)
    {
        this.mat = arr;
    }

    //Método para inicializar arreglo con caracteres aleatorio y que no quede en blancos.
    private void inicializa2()
    {
        for (int i = 0; i < mat.length; i++)
        {
            for (int j = 0; j < mat.length; j++)
            {
                for (int k = 0; k < mat.length; k++)
                {
                    do
                    {
                        int x = (int) (Math.random() * 100);
                        if (x >= 32 && x <= 255)
                        {
                            mat[i][j][k] = (char) x;
                            break;
                        }
                    } while (true);
                }
            }
        }
    }

    public void desp1()
    {

        for (int i = 0; i < mat.length; i++)
        {
            System.out.println( (i + 1)+"{ " );
            for (int j = 0; j < mat.length; j++)
            {
                System.out.println("\t " + (j + 1) + "{");
                for (int k = 0; k < mat.length; k++)
                {
                    System.out.print("\t\t " + (k + 1) + " { " + mat[i][j][k] + "}\n");
                }
                System.out.println("\t }");
            }
            System.out.println("}\n");
        }
    }

    public void desp2()
    {
        for (char[][] c : mat)
        {
            System.out.println(c);
        }
    }

    public void redimensiona(int ne)
    {
        if (ne > mat.length)
        {
            char nuevo[][][] = new char[ne][][];
            System.arraycopy(mat, 0, nuevo, 0, mat.length);
            mat = nuevo;
        }

    }
}
