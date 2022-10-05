/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objeto;

import java.util.Objects;

/**
 *
 * @author ailen
 */
public class PaisObject {
    
    private String pais;

    public PaisObject() {
    }

    public PaisObject(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.pais);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PaisObject other = (PaisObject) obj;
        if (!Objects.equals(this.pais, other.pais)) {
            return false;
        }
        return true;
    }
    
     public static java.util.Comparator<PaisObject> compararPais = new java.util.Comparator<PaisObject>() { // Creamos un objeto comparator 
        @Override // Usamos el override para traer un metodo de otra clase y poder usarlo
        public int compare(PaisObject e1, PaisObject e2) { // Le pasamos dos objetos a comparar
            return e1.getPais().compareTo(e2.getPais()); // Los comparamos usando el get y el compareTo
        }
    };
    
}
