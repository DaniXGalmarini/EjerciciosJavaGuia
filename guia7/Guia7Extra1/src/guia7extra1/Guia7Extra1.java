/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7extra1;

import Entidad.Cancion;
import java.util.Scanner;

/**
 *
 * @author dgalm
 */
public class Guia7Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);        
        //instanciamos solamente cancion 1
        Cancion c1=new Cancion();
        //instanciamos y pasamos parametros en cancion 1
        Cancion c2=new Cancion("Aventurera", "El Loco Amato");
        
        //pasamos los parametros de la cancion 1
        
        System.out.println("Ingrese el nombre de la cancion 1");
        c1.setTitulo(leer.nextLine());
        System.out.println("Ingrese el autor de la cancion 1");
        c1.setAutor(leer.nextLine());
       
        // hora de mostrar todo
        System.out.println("La cancion 1 es: "+ c1.getTitulo()+" y es interpretada por "+c1.getAutor());
        System.out.println("------------------------------------------");
        System.out.println("La cancion 2 es: "+ c2.getTitulo()+" y es interpretada por "+c2.getAutor());
        
    }
    
}
