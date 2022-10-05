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
public class Tienda {
    private String nombreP;
    private String precio;
    private Integer numPro;
    private String newProd;

    public Tienda() {
    }

    public Tienda(String nombreP, String precio,Integer numPro, String newProd) {
        this.nombreP = nombreP;
        this.precio = precio;
        this.numPro = numPro;
        this.newProd = newProd;
    }

    public String getNewProd() {
        return newProd;
    }

    public void setNewProd(String newProd) {
        this.newProd = newProd;
    }

    public Integer getNumPro() {
        return numPro;
    }

    public void setNumPro(Integer numPro) {
        this.numPro = numPro;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.nombreP);
        hash = 97 * hash + Objects.hashCode(this.precio);
        hash = 97 * hash + Objects.hashCode(this.numPro);
        hash = 97 * hash + Objects.hashCode(this.newProd);
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
        final Tienda other = (Tienda) obj;
        if (!Objects.equals(this.nombreP, other.nombreP)) {
            return false;
        }
        if (!Objects.equals(this.precio, other.precio)) {
            return false;
        }
        if (!Objects.equals(this.newProd, other.newProd)) {
            return false;
        }
        if (!Objects.equals(this.numPro, other.numPro)) {
            return false;
        }
        return true;
    }


    
}
