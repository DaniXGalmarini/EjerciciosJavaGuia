/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.eje3;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author dgalm
 */
public class Guia7Eje3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);        
        Operacion op=new Operacion();
        Operacion op2=new Operacion(5,6);
       
        System.out.println("Bienvenido al calculo de circunferencia");
        int option;
        
        do { System.out.println("MENU");
            System.out.println("1-CARGAR NUMEROS");
            System.out.println("2-SUMAR");
            System.out.println("3-RESTAR");
            System.out.println("4-MULTIPLICAR");
            System.out.println("5-DIVIDIR");
            System.out.println("");
            System.out.println("");
            System.out.println("INGRESE UNA OPCION");
            option=leer.nextInt();
            switch (option){
                case 1: op.crearOperacion();
                break;
                case 2: op.sumar();
                break;
                case 3: op.restar();
                break;
                case 4: op.multiplicar();
                break;
                case 5: op.dividir();
                default:
                                          
            }
          
        }while (option<6);
        
        System.out.println("Los numeros de la operacion 2 son "+op2.getNum1()+" "+op2.getNum2());
    }
    
}
