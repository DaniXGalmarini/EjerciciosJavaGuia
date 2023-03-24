/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nombre;

import java.util.Scanner;

/**
 *
 * @author Dani
 */
public class Nombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
        Scanner leer= new Scanner(System.in);
        leer.useDelimiter("\n");
        System.out.println("Ingrese una frase:");
        frase=leer.next();
        
        System.out.println("La frase en Mayuscula: "+ frase.toUpperCase());
        System.out.println("La frase en Minuscula:" + frase.toLowerCase());
    }
    
}