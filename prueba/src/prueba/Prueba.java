/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author Dani
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre=leer.nextLine();
        System.out.println("");
        System.out.println("Hola "+ nombre+" ¿como estas?");
        
        
    }
}
