/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diego;

import java.util.Scanner;

/**
 *
 * @author Dani
 */
public class Diego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num, par = 0, impar = 0, cont = 0;
        
        while (true) {
            System.out.print("Ingrese un número entero positivo: ");
            num = leer.nextInt();
            
            if (num < 0) {
                System.out.println("Error. El número es negativo");
                continue;
            }
            
            cont++;
            if (num % 2 == 0) {
                par++;
            } else {
                impar++;
            }
            
            if (num % 5 == 0) {
                System.out.println("El número " + num + " es múltiplo de cinco.");
                System.out.println("Cantidad total de números leídos: " + cont);
                System.out.println("Cantidad de números pares: " + par);
                System.out.println("Cantidad de números impares: " + impar);
                break;
            }
        }
    }
}

