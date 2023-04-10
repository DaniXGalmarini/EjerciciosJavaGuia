/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.extra2;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author dgalm
 */
public class Guia7Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Puntos p1= new Puntos();
        Scanner leer = new Scanner(System.in);        
        int option;
        do{
            System.out.println("*************************************");
            System.out.println("CALCULO DISTANCIA ENTRE 2 PUNTOS");
            System.out.println("*************************************");
            System.out.println("1-CARGAR PUNTOS");
            System.out.println("2-CALCULAR DISTANCIA");
            System.out.println("3-GRAFICO");
            System.out.println("4-SALIR");
            option=leer.nextInt();
            switch (option){
                case 1: p1.cargarPuntos();
                break;
                case 2:p1.distancia();
                break;
                case 3: p1.mostrar();
                break;
                default:
              
            }
        }while (option<4);

    }
    
}
