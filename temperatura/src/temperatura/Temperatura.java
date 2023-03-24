/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatura;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author Dani
 */
public class Temperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        float temperatura;
        System.out.println("Ingrese una temperatura en °: ");
        temperatura=Float.parseFloat(leer.next());
        temperatura=32+(9*temperatura/5);
        System.out.println("La temperatura en Farenheit: " + temperatura);       
    }
    
}
