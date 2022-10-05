/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetoA;

import java.util.ArrayList;

/**
 *
 * @author ailen
 */
public class Alumno {
    private String nombre;
    private Integer nota;
     private Integer nota2;
      private Integer nota3;
    private ArrayList<Object> lista;
    private ArrayList<Object> lista2;

    public Alumno() {
    }

    public Alumno(String nombre, Integer nota,Integer nota2,Integer nota3, ArrayList<Object> lista,ArrayList<Object> lista2) {
        this.nombre = nombre;
        this.nota = nota;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.lista = lista;
        this.lista = lista2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public Integer getNota2() {
        return nota2;
    }

    public void setNota2(Integer nota2) {
        this.nota2 = nota2;
    }

    public Integer getNota3() {
        return nota3;
    }

    public void setNota3(Integer nota3) {
        this.nota3 = nota3;
    }

    public ArrayList<Object> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Object> lista) {
        this.lista = lista;
    }

    public ArrayList<Object> getLista2() {
        return lista2;
    }

    public void setLista2(ArrayList<Object> lista2) {
        this.lista2 = lista2;
    }
   
    
}
