/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaisServicio;

import Objeto.PaisObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class ServicioP {

    public PaisObject menuPais() {
        PaisObject p1 = new PaisObject();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int respuesta;
        String res;
        HashSet<String> paises = new HashSet();

        do {
            System.out.println("--------- Menu ---------");
            System.out.println("1)_Agregar pais:");
            System.out.println("2)_Mostrar lista de Paises");
            System.out.println("3)_Borrar un Pais de la lista");
            System.out.println("4)_Salir");
            System.out.println("");
            System.out.println("Que desea hacer?");
            respuesta = leer.nextInt();

            switch (respuesta) {
                case 1:
                    do {
                        System.out.println("");
                        System.out.println("Ingrese el nombre del pais:");
                        p1.setPais(leer.next());
                        System.out.println("");
                        
                        paises.add(p1.getPais());
                        
                        System.out.println("Desea ingresar otro Pais?");
                        res = leer.next();
                        System.out.println("");

                    } while (res.equals("Si") || res.equals("si"));

                    break;

                case 2:

                    ArrayList<String> listap = new ArrayList(paises);
                    // Ordenamos la lista.
                    Collections.sort(listap);

                    System.out.println("Lista de paises: ");
                    System.out.println("");
                    for (String x : listap) {
                        System.out.println("- " + x);
                    }
                    System.out.println("");

                    break;

                case 3:
                    String paisb,
                     resP;

                    do {
                        System.out.println("");
                        System.out.println("Ingrese un nombre de Pais para borrar: ");
                        paisb = leer.next();

//                    if(p1.getPais().equals(paisb)){
//                        paises.remove();
//                    }
                        Iterator<String> Ip = paises.iterator();

//                        while (Ip.hasNext()) {
//                            if (Ip.next().equals(paisb)) {
//                                Ip.remove();
//                            }
//                        }
                        do {                            
                            if (Ip.next().equals(paisb)) {
                                Ip.remove();
                            }else{
                                System.out.println("Pais no encontrado!");
                            }
                        } while (Ip.hasNext());
                        
                        System.out.println("");
                        System.out.println("Desea borrar otro Pais?");
                        resP = leer.next();
                    } while (resP.equals("Si") || resP.equals("si"));

                    break;
                case 4:
                    System.out.println("");
                    System.out.println("--------Fin del Proceso--------");
                    System.out.println("");
                    break;

            }

        } while (respuesta != 4);

        return p1;
    }

}
