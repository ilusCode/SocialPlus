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
public class Prb2
{

    public static void main(String[] args)
    {
        int opc = 0;
        int opc2 = 0;
        String[] mnu =
        {
            "Altas", "Bajas", "Consultas", "Modificaciones", "Salir"
        };
        String[] mnu2 =
        {
            "Pacientes", "Doctores", "Salir"
        };

        Datos[] arr = null;
        arr = ManipulaArchivos.carga();
        do
        {
            opc2 = ManipulaDatos.pintaMenu(mnu2);
            switch (opc2)
            {
                case 1:
                    System.out.println("\tSubmenú\n\t" + mnu2[opc2 - 1]);
                    do
                    {
                        opc = ManipulaDatos.pintaMenu(mnu);
                        switch (opc)
                        {
                            case 1:
                                System.out.println("\n\t==Altas==\t");
                                arr = ManipulaDatos.inserta(arr, ManipulaDatos.creaObj(opc2));
                                break;
                            case 2:
                                System.out.println("\n\t==Bajas==\t");
                                System.out.print("Dame un nombre a modificar: ");
                                int p = ManipulaDatos.busca(arr, Lecturas.cadena(),opc2);
                                if (p != -1)
                                {
                                    System.out.println(arr[p].desp());
                                    System.out.print("Desea eliminar este registro\n[1] -> Si\n[0] -> no\nOpción: ");
                                    if (Lecturas.entero() == 1)
                                    {
                                        arr = ManipulaDatos.elimina(arr, p);
                                    }
                                }
                                break;
                            case 3:
                                System.out.println("\n\t==Consultas==\t");
                                System.out.println(ManipulaDatos.consulta(arr,opc2));
                                break;
                            case 4:
                                System.out.println("\n\t==Modificaciones==\t");
                                System.out.print("Dame un nombre a modificar: ");
                                int p1 = 0;
                                p1 = ManipulaDatos.busca(arr, Lecturas.cadena(),opc2);
                                if (p1 != -1)
                                {
                                    System.out.println(arr[p1].desp());
                                    System.out.print("Desea modificar este registro\n[1] -> Si\n[0] -> no\nOpción: ");
                                    if (Lecturas.entero() == 1)
                                    {
                                        arr[p1] = ManipulaDatos.creaObj(opc2);
                                    }
                                }
                                break;
                            case 5:
                                System.out.println("\n\t==Salir==\t");
                                break;
                            default:
                                System.out.println("\nError... Opción Incorrecta.");
                                break;
                        }
                    } while (opc != mnu.length);
                    break;
                case 2:
                    System.out.println("\tSubmenú\n\t" + mnu2[opc2 - 1]);
                    do
                    {
                        opc = ManipulaDatos.pintaMenu(mnu);
                        switch (opc)
                        {
                            case 1:
                                System.out.println("\n\t==Altas==\t");
                                arr = ManipulaDatos.inserta(arr, ManipulaDatos.creaObj(opc2));
                                break;
                            case 2:
                                System.out.println("\n\t==Bajas==\t");
                                System.out.print("Dame un nombre a modificar: ");
                                int p = ManipulaDatos.busca(arr, Lecturas.cadena(),opc2);
                                if (p != -1)
                                {
                                    System.out.println(arr[p].desp());
                                    System.out.print("Desea eliminar este registro\n[1] -> Si\n[0] -> no\nOpción: ");
                                    if (Lecturas.entero() == 1)
                                    {
                                        arr = ManipulaDatos.elimina(arr, p);
                                    }
                                }
                                break;
                            case 3:
                                System.out.println("\n\t==Consultas==\t");
                                System.out.println(ManipulaDatos.consulta(arr,opc2));
                                break;
                            case 4:
                                System.out.println("\n\t==Modificaciones==\t");
                                System.out.print("Dame un nombre a modificar: ");
                                int p1 = 0;
                                p1 = ManipulaDatos.busca(arr, Lecturas.cadena(),opc2);
                                if (p1 != -1)
                                {
                                    System.out.println(arr[p1].desp());
                                    System.out.print("Desea modificar este registro\n[1] -> Si\n[0] -> no\nOpción: ");
                                    if (Lecturas.entero() == 1)
                                    {
                                        arr[p1] = ManipulaDatos.creaObj(opc2);
                                    }
                                }
                                break;
                            case 5:
                                System.out.println("\n\t==Salir==\t");
                                break;
                            default:
                                System.out.println("\nError... Opción Incorrecta.");
                                break;
                        }
                    } while (opc != mnu.length);
                    break;
                case 3:
                    System.out.println("......Saliendo.....");
                    break;
                default:
                    System.out.println("Error..Opción incorrecta");
                    break;
            }
        } while (opc2 != mnu2.length);

        ManipulaArchivos.guarda(arr);

    }
}
