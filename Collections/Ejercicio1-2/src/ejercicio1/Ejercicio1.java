/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import Object.EntidadP;
import ServicioP.ServicioPerros;
import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioPerros Sp = new ServicioPerros();
 
        EntidadP P1 = Sp.llenarNPerros();
        Sp.mostrarRazas(P1);
        Sp.eliminarRaza(P1);
       

    }

}
