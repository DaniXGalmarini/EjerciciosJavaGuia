/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

import java.util.Scanner;

/**
 *
 * @author Dani
 */
public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer= new Scanner(System.in);
 
        int aux=0;
        int a = (int) (Math.random()*10);
        int b = (int) (Math.random()*10);
        int c = (int) (Math.random()*10);
        int d = (int) (Math.random()*10);
        System.out.println("Estas seran las variables: A="+a+" B="+b+" C="+c+" D="+d);
        aux=b;
        b=c;
        c=a;
        a=d;
        d=aux;
      
        System.out.println("Ahora: A="+a+" B="+b+" C="+c+" D="+d);
    }
}

