/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioTienda;

import Objeto.Tienda;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class TiendaS {

    public Tienda MenuTienda() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Tienda t1 = new Tienda();

        int selecnum;
        Integer codb;
        String resp;

        HashSet<Object> listaT = new HashSet();

        HashMap<Integer, Object> tien;
        tien = new HashMap();

        do {
            System.out.println("-------- Menu --------");
            System.out.println("1)_Ingresar productos:");
            System.out.println("2)_Mostrar productos: ");
            System.out.println("3)_Borrar producto:");
            System.out.println("4)_Modificar el precio:");
            System.out.println("5)_Salir");
            System.out.println("");
            System.out.println("Que desea hacer?: ");
            selecnum = leer.nextInt();

            switch (selecnum) {

                case 1:

                    int prod;

                    do {
                        System.out.println("");
                        System.out.println("Codigo del producto: ");
                        t1.setNumPro(leer.nextInt());

                        System.out.println("");
                        System.out.println("Ingrese el nombre del producto:");
                        t1.setNombreP(leer.next());
                        System.out.println("");

                        System.out.println("Ingrese el precio del producto:");
                        t1.setPrecio(leer.next());
                        System.out.println("");

                        listaT.add(t1.getNombreP() + " - " + t1.getPrecio());

                        System.out.println("");
                        System.out.println("Desea ingresar otro produscto? (1-Si || 2-No): ");
                        prod = leer.nextInt();
                        System.out.println("");

                        ArrayList<String> lista = new ArrayList(listaT);

                        tien.put(t1.getNumPro(), lista);

                    } while (prod == 1);

                    break;

                case 2:

                    System.out.println("");
                    System.out.println("Codigo | Nombre del producto |  Precio");
                    System.out.println("----------------------------------------");
                    System.out.println("");

                    for (Map.Entry<Integer, Object> entry : tien.entrySet()) {
                        Integer key = entry.getKey();
                        Object value = entry.getValue();
                        System.out.println(key + "    " + value);
                    }
                    System.out.println("");

                    break;
                case 3:
                    //String ncode = t1.getNombreP();

                    System.out.println("");
                    System.out.println("Que producto desea borrar? Ingrese el codigo del producto: ");
                    codb = leer.nextInt();

                    if (Objects.equals(t1.getNumPro(), codb)) {
                        tien.remove(t1.getNumPro());
                    }

                    break;

                case 4:
                    String res;

                    System.out.println("");
                    System.out.println("Que producto desea cambiar el precio? Ingrese el nombre:");
                    t1.setNewProd(leer.next());
                    do {
                        //if (t1.getNewProd().equals(t1.getNombreP())) {
                        //}
                        //lista.sort(Tienda.compararNombreProducto); // Los ordenamos por el documento mediante un comparator
                        System.out.println("");
                        for (Object object : listaT) {

                            System.out.println("Ingrese el nuevo precio al producto: ");
                            t1.setPrecio(leer.next());
                            listaT.add(t1.getNombreP() + " " + t1.getPrecio());

                        }

                        System.out.println("Desea cambiar el precio de otro producto?");
                        res = leer.next();

                    } while (res.equals("si") || res.equals("Si"));

                    break;

                case 5:
                    System.out.println("");
                    System.out.println("Gracias por ingresar a la tienda!");
                    break;

            }
        } while (selecnum != 5);

        return t1;

    }
}
