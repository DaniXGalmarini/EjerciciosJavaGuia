/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package limitepositivo;

import java.util.Scanner;

/**
Escriba un programa en el cual se ingrese un valor límite positivo, 
* y a continuación solicite números al usuario 
* hasta que la suma de los números introducidos supere el límite inicial.
 */
public class LimitePositivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numLimite, num, acumulador=0;
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero limite:");
        numLimite=leer.nextInt();
        //acumulador=0;
        do {
            System.out.println("Ingrese un numero:");
            num=leer.nextInt();
            acumulador=acumulador+num;
        }
        while (acumulador<numLimite);
        
        System.out.println("La suma de los numeros ingresados es: "+acumulador);  
    }
}
