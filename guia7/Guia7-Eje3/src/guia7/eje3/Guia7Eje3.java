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
       
       
        System.out.println("Bienvenido al programa de Calculo");
        int option;
        
        do { System.out.println("MENU");
            System.out.println("1-CARGAR NUMEROS");
            System.out.println("2-SUMAR");
            System.out.println("3-RESTAR");
            System.out.println("4-MULTIPLICAR");
            System.out.println("5-DIVIDIR");
            System.out.println("");
            System.out.println("6-SALIR");
            System.out.println("INGRESE UNA OPCION");
            option=leer.nextInt();
            switch (option){
                case 1:System.out.println("Los numeros de la operacion son "+1
                case 2:System.out.println("Los numeros de la operacion son "+op.getNum1()+" "+op.getNum2()); 
                    op.sumar();
                break;
                case 3:System.out.println("Los numeros de la operacion son "+op.getNum1()+" "+op.getNum2());
                    op.restar();
                break;
                case 4:System.out.println("Los numeros de la operacion son "+op.getNum1()+" "+op.getNum2()); 
                    op.multiplicar();
                break;
                case 5:System.out.println("Los numeros de la operacion 2 son "+op.getNum1()+" "+op.getNum2());
                    op.dividir();
                default:
                                          
            }
          
        }while (option<6);

    }
    
}
