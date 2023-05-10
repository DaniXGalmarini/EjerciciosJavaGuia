package servicios;

import entidad.pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import utilidades.comparadores;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

22

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 * @author dgalm
 */
public class serviciosPelicula {
    static Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); 
    
    
    public ArrayList<pelicula> cargarPelicula(){
        int opcion;
        ArrayList<pelicula> peliculalista = new ArrayList();

        do {
            System.out.println("Ingrese titulo");
            String titulo = leer.next();
            System.out.println("Ingrese director");
            String director = leer.next();
            System.out.println("Ingrese duracion");
            int duracion = leer.nextInt();
            peliculalista.add(new pelicula(titulo, director, duracion));
            System.out.println("Desea cargar mas peliculas? 1-SI / 2-NO");
            opcion = leer.nextInt();
        } while (opcion != 2);
        return peliculalista;
    }
    
    public void mostrarPelicula(ArrayList<pelicula> p){
        p.forEach((object) -> {
            System.out.println(object);
        });
        
        
    }
    
    public void mayorduracion(ArrayList<pelicula> p){
        int bandera=0;
        Iterator <pelicula> it=p.iterator();
        while (it.hasNext()) {
            pelicula next = it.next();
            if (next.getDuracion()>2){
                System.out.println(next.toString());
                bandera=1;
            }
            
        }
        System.out.println(bandera==0?"No hay peliculas que duren mas de 1 hora":" ");
        
    }

    public void ordenarDescendente(ArrayList<pelicula> p) {
        Collections.sort(p, comparadores.compararduracion);
        for (pelicula object : p) {
            System.out.println(object);
        }
    }

    public void ordenarAscendente(ArrayList<pelicula> p) {
        Collections.sort(p, comparadores.compararduracion2);
        for (pelicula object : p) {
            System.out.println(object);
        }
    }

    public void ordenarTitulo(ArrayList<pelicula> p) {
        Collections.sort(p, comparadores.ordenarTitulo);
        for (pelicula object : p) {
            System.out.println(object);
        }
    }

    public void ordenarDirector(ArrayList<pelicula> p) {
        Collections.sort(p, comparadores.ordenarDirector);
        for (pelicula object : p) {
            System.out.println(object);
        }
    }
}
