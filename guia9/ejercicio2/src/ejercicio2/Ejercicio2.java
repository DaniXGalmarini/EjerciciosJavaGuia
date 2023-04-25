/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import Entidad.ParDeNumeros;
import Servicios.ParDeNumerosService;
import java.util.Scanner;

/**
 *
 * @author dgalm
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);        
        ParDeNumerosService ps= new ParDeNumerosService();
        int opcion=1, option;
        
        do{
            ParDeNumeros p1=new ParDeNumeros();
            do{
                System.out.println("MENU");
                System.out.println("1-MOSTRAR VALORES");
                System.out.println("2-DEVOLVER MAYOR");
                System.out.println("3-CALCULAR POTENCIA");
                System.out.println("4-CALCULAR RAIZ");
                System.out.println("5-SALIR");
                option=leer.nextInt();
                
                switch(option){
                    case 1:ps.mostarValores(p1);
                    break;
                    case 2:System.out.println("El numero mayor es: "+ ps.devolverMayor(p1));
                    break;
                    case 3: ps.calcularPotencia(p1);
                    break;
                    case 4:ps.calcularRaiz(p1);
                    break;
                    default:
                }
            }while (option<5);
            System.out.println("Desea que se carguen otros numeros aleatorios?: 1-SI / 2-NO");
            opcion=leer.nextInt();
        }while (opcion==1);

        
    }
    
}
