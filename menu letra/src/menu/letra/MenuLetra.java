/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.letra;

import java.util.Scanner;

/**
 *
 * @author Dani
 */
public class MenuLetra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     String letra;    
     System.out.println("Escriba el tipo de socio:");
        
        letra= leer.nextLine();
        letra=letra.toUpperCase();
        
        System.out.println("Ingrese el valor del tratamiento ");
        int costo= leer.nextInt();
        
        switch (letra) {

            case "A":
                System.out.println("El costo de tratamiento sera : " + (costo*0.5));
                break;

            case "B":
                 System.out.println("El costo de tratamiento sera : " + (costo*0.35));
                break;

            case "C":
                 System.out.println("El costo de tratamiento sera : " + costo);
                break;
            
            default:
                System.out.println("Escribiste un valor no valido");
    }
    
}
