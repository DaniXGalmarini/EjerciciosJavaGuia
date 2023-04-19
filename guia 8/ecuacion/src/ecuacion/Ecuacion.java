/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuacion;

import entidad.Raices;
import entidad.RaicesServicios.RaicesServicios;
import java.util.Scanner;

/**
 *
 * @author ovied
 */
public class Ecuacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        boolean opcion=true;
        int option;
        String resp;
        do{
            System.out.println("Ingrese el coeficiente A");
            double a=leer.nextDouble();
            System.out.println("Ingrese el coeficiente B");
            double b=leer.nextDouble();
            System.out.println("Ingrese el coeficiente C");
            double c=leer.nextDouble();
            RaicesServicios rv= new RaicesServicios();
            Raices r=new Raices(a,b,c);
            do{
                
                System.out.println("SISTEMA DE ECUACION DE 2DO GRADO");
                System.out.println("1-TIENE RAICES");
                System.out.println("2-TIENE RAIZ");
                System.out.println("3-CALCULAR");
                System.out.println("4-OBTENER DISCRIMINANTE");
                System.out.println("5-OBTENER RAICES");
                System.out.println("6-OBTENER RAIZ");
                System.out.println("7-SALIR");
                option=leer.nextInt();
                switch (option){
                    case 1: if (rv.tieneRaices(r)){
                        System.out.println("La ecuacion tiene 2 soluciones posibles");   
                    }else{System.out.println("No tiene 2 soluciones posibles");};
                        break;
                    case 2: if(rv.tieneRaiz(r)){
                        System.out.println("La ecuacion tiene una solucion posible");
                    }else{System.out.println("No tiene 1 solucion posible");};;
                        break;
                    case 3:rv.calcular(r);
                        break;
                    case 4:System.out.println("El discriminante de la ecuacion es: "+rv.getDiscriminante(r));
                        break;
                    case 5:rv.obtenerRaices(r);
                        break;
                    case 6:rv.obtenerRaiz(r);
                        break;
                    default:
                }
            }while(option<7);
            System.out.println("Desea cargar otros coeficientes? S/N");
            resp=leer.next();
            
        }while (resp.equals("S"));
        
    }
    
}
