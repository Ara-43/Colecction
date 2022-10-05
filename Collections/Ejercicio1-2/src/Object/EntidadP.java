/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import java.util.ArrayList;

/**
 *
 * @author ailen
 */
public class EntidadP {
    
    private ArrayList<String> nombreRaza;
    private String razaPerro;
    private int res;
    private String palabraBusEl;

    public EntidadP() {
    }

    public EntidadP(String razaPerro,int res,ArrayList<String> nombreRaza,String palabraBusEl) {
        this.nombreRaza = nombreRaza;
        this.razaPerro = razaPerro;
        this.res= res;
        this.palabraBusEl = palabraBusEl;
    }

    public String getPalabraBusEl() {
        return palabraBusEl;
    }

    public void setPalabraBusEl(String palabraBusEl) {
        this.palabraBusEl = palabraBusEl;
    }

    public ArrayList<String> getNombreRaza() {
        return nombreRaza;
    }

    public void setNombreRaza(ArrayList<String> nombreRaza) {
        this.nombreRaza = nombreRaza;
    }
   
    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public String getRazaPerro() {
        return razaPerro;
    }

    public void setRazaPerro(String razaPerro) {
        this.razaPerro = razaPerro;
    }

    
}
