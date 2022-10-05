/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objeto;

/**
 *
 * @author ailen
 */
public class Comparator {
    public static java.util.Comparator<Tienda> compararNombreProducto = new java.util.Comparator<Tienda>() { // Creamos un objeto comparator 
        @Override // Usamos el override para traer un metodo de otra clase y poder usarlo
        public int compare(Tienda e1, Tienda e2) { // Le pasamos dos objetos a comparar
            return e1.getNombreP().compareTo(e2.getNewProd()); // Los comparamos usando el get y el compareTo
        }
    };
    
    
}
