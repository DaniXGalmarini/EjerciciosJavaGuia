/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compararfrase;

import java.util.Scanner;

/**
 *
 * @author Dani
 */
public class CompararFrase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
        Scanner leer= new Scanner (System.in);
        System.out.println("Ingrese una frase:");
        frase=leer.nextLine();
        frase=frase.toUpperCase();
        
        if (frase.equals("EUREKA")){
            System.out.println("Las frases son iguales"); 
        }
        else {
            System.out.println("Las frases no son iguales");
        }
        
    }
    
}
