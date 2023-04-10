/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.eje5;

import Entidad.Empleado;
import java.util.Scanner;

/**
 *
 * @author dgalm
 */
public class Guia7Eje5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);        
        Empleado e1=new Empleado();
        System.out.println("Ingrese Nombre del empleado:");
        e1.setNombre(leer.nextLine());
        System.out.println("Ingrese la edad del empleado:");
        e1.setEdad(leer.nextInt());
        System.out.println("Ingrese Salario");
        e1.setSalario(leer.nextDouble());
        
        System.out.println("El salario actual del empleado es "+e1.getSalario()+"\ny despues del aumento va a ser: "+e1.calcular_aumento());
        
          System.out.println("El salario actual del empleado es "+e1.getSalario()+"\ny despues del aumento va a ser: "+e1.calcular_aumento());
    }
    
}
