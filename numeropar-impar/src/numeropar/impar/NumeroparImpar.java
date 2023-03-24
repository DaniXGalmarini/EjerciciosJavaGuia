/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeropar.impar;

import java.util.Scanner;

/**
 *
 * @author Dani
 */
public class NumeroparImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador=0,num=0,par=0,impar=0;
           do{
                System.out.println("Ingrese un numero entero ");
                num = sc.nextInt();
                if(num %5==0){
                break;}
                
             contador++;
            if (num%2== 0) {
                par++;
            }
            else{ 
                impar++;                
            }
           }while(num>0);

        System.out.println("los numero leidos fueron: " + contador);
        System.out.println("el numero pares ingresado fueron: " + par );
        System.out.println("el numero impares ingresado fueron: " + impar );
    }
    
}
