/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import entidad.pelicula;
import java.util.Comparator;

/**
 *
 * @author dgalm
 */
public class comparadores {
    
    public static Comparator<pelicula> compararduracion=new Comparator<pelicula>(){
            @Override
            public int compare(pelicula p1, pelicula p2){
                return p2.getDuracion().compareTo(p1.getDuracion());
            }
        };
    
    public static Comparator<pelicula> compararduracion2=new Comparator<pelicula>(){
            @Override
            public int compare(pelicula p1, pelicula p2){
                return p1.getDuracion().compareTo(p2.getDuracion());
            }
        };
    
    public static Comparator<pelicula> ordenarTitulo=new Comparator<pelicula>(){
            @Override
            public int compare(pelicula p1, pelicula p2){
                return p1.getTitulo().compareTo(p2.getTitulo());
            }
        };
    
     public static Comparator<pelicula> ordenarDirector=new Comparator<pelicula>(){
            @Override
            public int compare(pelicula p1, pelicula p2){
                return p1.getDirector().compareTo(p2.getDirector());
            }
        };
}
