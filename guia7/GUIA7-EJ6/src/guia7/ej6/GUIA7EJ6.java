    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.ej6;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author dgalm
 */
public class GUIA7EJ6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);        
        Rectangulo r1=new Rectangulo(4,6);
        
        Rectangulo[] rectangulos= new Rectangulo[10];
        
        
        
        System.out.println("El calculo del area es: "+r1.calcular_area());
    
        for (int i = 0; i < 10; i++) {
            rectangulos[i]= new Rectangulo(4+i,5+i);
          System.out.println("El calculo del area es: "+rectangulos[i].calcular_area());
        //System.out.println("El calculo del area es: "+R5.calcular_area());
    
        
        }
        System.out.println("el area del rectangulo 4 es: "+rectangulos[3].calcular_area());
        
        
                
    
    
    
    }
    
}
