/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10.ej4;

import entidad.pelicula;
import java.util.ArrayList;
import servicios.serviciosPelicula;

/**
 *Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).

 * @author dgalm
 */
public class Guia10Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        serviciosPelicula sp=new serviciosPelicula();
        ArrayList <pelicula> p=sp.cargarPelicula();
        System.out.println("Las peliculas cargadas son:");
        sp.mostrarPelicula(p);
        System.out.println("-------------------------------");
         System.out.println("Las que duran mas de 2 hrs son");
         System.out.println("-------------------------------");
        sp.mayorduracion(p);
        System.out.println("-------------------------------");
        System.out.println("Ordenadas Ascendentemente");
        System.out.println("-------------------------------");
        sp.ordenarAscendente(p);
        System.out.println("-------------------------------");
         System.out.println("Ordenadas Descendentemente");
         System.out.println("-------------------------------");
        sp.ordenarDescendente(p);
        System.out.println("-------------------------------");
        System.out.println("Ordenadas por titulo");
        System.out.println("-------------------------------");
        sp.ordenarTitulo(p);
        System.out.println("-------------------------------");
        System.out.println("Ordenadas por Director");
        System.out.println("-------------------------------");
        sp.ordenarDirector(p);
    }
   
    
}
