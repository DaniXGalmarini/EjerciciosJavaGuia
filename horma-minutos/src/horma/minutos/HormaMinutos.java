/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horma.minutos;

import java.util.Scanner;

/**
 *
 * @author Dani
 */
public class HormaMinutos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos:");
        int min= leer.nextInt();
        
        System.out.println("La cantidad de dias es: "+ (min/(24*60)+ " y "+ (min-(min/(24*60))/(24*60)+" horas";
        
        
        }
    
}
