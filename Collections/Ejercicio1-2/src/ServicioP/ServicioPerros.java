/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioP;

import Object.EntidadP;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class ServicioPerros {

    public EntidadP llenarNPerros() {

        EntidadP P1 = new EntidadP();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        String numRaza, respuesta, respuesta2;

        ArrayList<String> newRaza;
        newRaza = new ArrayList();

//        System.out.println("Cuantas razas de perros va ingresar?");
//        P1.setRes(leer.nextInt());
//        System.out.println("");
//        for (int i = 0; i < P1.getRes(); i++) {
//            System.out.println("Ingrese el nombre de la raza: ");
//            P1.setRazaPerro(leer.next());
//            System.out.println("");
//
//            String razas = P1.getRazaPerro();
//            P1.setNombreRaza(newRaza);
//            newRaza.add(razas);
//        }

        System.out.println("Desea ingresar una raza?");
        respuesta = leer.next();
        System.out.println("");
        
        do {
            System.out.println("Ingrese el nombre de la raza: ");
            P1.setRazaPerro(leer.next());
            System.out.println("");

            String razas = P1.getRazaPerro();
            
            P1.setNombreRaza(newRaza);
            newRaza.add(razas);
            
            System.out.println("");
            
            System.out.println("Desea ingresar una raza?");
            respuesta2 = leer.next();
            
            System.out.println("");
            
        } while (respuesta2.equals("si") || respuesta2.equals("SI"));

        return P1;
    }

    public void mostrarRazas(EntidadP P1) {

        //System.out.println(P1.getNombreRaza());
        System.out.println("-----------Las razas de perros ingresadas son-----------");
//        for (String object : P1.getNombreRaza()) {
//            System.out.println("- " + object);
//        }
//    
        System.out.println("");
//Para mostras la Arraylist utilizar este for:
        for (int i = 0; i < P1.getNombreRaza().size(); i++) {
            System.out.println("- " + P1.getNombreRaza().get(i));
        }

    }

    public void eliminarRaza(EntidadP P1) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        String n, letram;

        System.out.println("");
        System.out.println("-----------Eliminacion de una Raza en la lista-----------");
        System.out.println("");
        System.out.println("Desea eliminar algun elemento de la lista?");
        String respuesta = leer.next();
        System.out.println("");

        letram = respuesta.toLowerCase();

        switch (letram) {

            case "si":

                boolean raza = false;

                System.out.println("Ingrese el nombre de la raza a eleminar:");
                P1.setPalabraBusEl(leer.next());

                //Para borrar un elemento de la ArrayList Utilizar esto:
                for (int i = 0; i < P1.getNombreRaza().size(); i++) {

                    n = P1.getNombreRaza().get(i);

                    if (n.equals(P1.getPalabraBusEl())) {
                        raza = true;
                        P1.getNombreRaza().remove(n);
                    }
                }
                if (raza == true) {
                    System.out.println("");
                    System.out.println("-----------La lista queda asi-----------");
                    System.out.println("");
                    P1.getNombreRaza().forEach((e) -> System.out.println("- " + e));
                    System.out.println("");
                } else {
                    System.out.println("");
                    System.out.println("Error! nombre de la raza no encontrada!");
                    System.out.println("-----------La lista queda asi-----------");
                    System.out.println("");
                    P1.getNombreRaza().forEach((e) -> System.out.println("- " + e));
                    System.out.println("");
                }
                break;

            case "no":
                System.out.println("");
                System.out.println("-----------La lista queda asi-----------");
                System.out.println("");
                P1.getNombreRaza().forEach((i) -> System.out.println("- " + i));
                System.out.println("");
                break;
        }
    }

}
