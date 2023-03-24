/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esmultiplo;

import java.util.Scanner;

/**
 *
 * @author Dani
 */
public class EsMultiplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa el 1er número");
        num1=leer.nextInt();
        System.out.println("Ingresa el 2do número");
        num2=leer.nextInt();
        
        if(EsMultiplo(num1, num2)){
            System.out.println("Es multiplo");
        }else{
            System.out.println("No es multiplo");
        }
        
        
    }
    
    
    public static boolean EsMultiplo(int num1, int num2){
        
        boolean respuesta=false;
        if(num1 % num2==0){
            respuesta=true;
        }
        
        return respuesta;
    }