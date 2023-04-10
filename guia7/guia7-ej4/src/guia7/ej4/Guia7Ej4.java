/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.ej4;

import entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author dgalm
 */
public class Guia7Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);        
        Cuenta c1= new Cuenta(2550,"Galmarini");
        
        System.out.println("Cuanto desea extraer?");
        c1.retirar_dinero(leer.nextDouble());
        
    }
    
}
