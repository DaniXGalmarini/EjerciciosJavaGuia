/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.eje2;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author dgalm
 */
public class Guia7Eje2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);        
        Circunferencia c1=new Circunferencia();
        System.out.println("Bienvenido al calculo de circunferencia");
        int option;
        
        do { System.out.println("MENU");
            System.out.println("1-CARGAR EL RADIO");
            System.out.println("2-CALCULAR EL AREA");
            System.out.println("3-CALCULAR EL PERIMETRO");
            System.out.println("4-SALIR");
            System.out.println("");
            System.out.println("");
            System.out.println("INGRESE UNA OPCION");
            option=leer.nextInt();
            switch (option){
                case 1: c1.crearCircunferencia();
                break;
                case 2: c1.area();
                break;
                case 3: c1.perimetro();
                break;
                default:
                                          
            }
          
        }while (option<4);
       
       
       
    }
    
    
}
