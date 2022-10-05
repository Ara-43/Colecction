/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioA;

import ObjetoA.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class ServicioAlumno {

    public Alumno llenarNomNotas() {

        Alumno a1 = new Alumno();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Object> listaAlum = new ArrayList();

        String respuesta, respuesta2;

        System.out.println("Desea ingresar un Alumno?");
        respuesta = leer.next();
        System.out.println("");

        do {
            System.out.println("Ingrese el nombre del Aumno: ");
            a1.setNombre(leer.next());
            System.out.println("");

            System.out.println("Ingrese la nota 1°del Alumno " + a1.getNombre());
            a1.setNota(leer.nextInt());

            System.out.println("");

            System.out.println("Ingrese la nota 2°del Alumno " + a1.getNombre());
            a1.setNota2(leer.nextInt());

            System.out.println("");

            System.out.println("Ingrese la nota 3°del Alumno " + a1.getNombre());
            a1.setNota3(leer.nextInt());

            System.out.println("");

            a1.setLista(listaAlum);

            listaAlum.add(a1.getNombre() + " " + a1.getNota() + " " + a1.getNota2() + " " + a1.getNota3());

            System.out.println("");

            System.out.println("Desea ingresar otro Alumno?");
            respuesta2 = leer.next();

            System.out.println("");

        } while (respuesta2.equals("si") || respuesta2.equals("SI"));

        return a1;
    }

    public void MostrarA(Alumno a1) {

        for (int i = 0; i < a1.getLista().size(); i++) {
            System.out.println("- " + a1.getLista().get(i));
        }
    }

    public void notaFinal(Alumno a1) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        String respuesta, respuesta2;
        int suma = 0;

        ArrayList<Object> NotasAlum = new ArrayList();

        System.out.println("Que alumo desea buscar?");

        do {
            a1.setLista2(NotasAlum);

            System.out.println("Ingrese el nombre del alumno:  ");
            String alumBus = leer.next();
            System.out.println("");
            
            suma = (a1.getNota() + a1.getNota2() + a1.getNota3()) * 3;
            
            if (alumBus.equals(a1.getNombre())) {

                NotasAlum.add(a1.getNombre() + " " + suma);
                a1.getLista2().forEach((e) -> System.out.println("- " + e));

            }
            
            System.out.println("");
            System.out.println("Desea buscar otro Alumno?");
            respuesta2 = leer.next();
            System.out.println("");

        } while (respuesta2.equals("si") || respuesta2.equals("SI"));
        System.out.println("---------Las notas finales de los Alumnos---------");
        System.out.println("");
        for (int i = 0; i < a1.getLista2().size(); i++) {
            System.out.println("- " + a1.getLista2().get(i));
        }

    }
}
