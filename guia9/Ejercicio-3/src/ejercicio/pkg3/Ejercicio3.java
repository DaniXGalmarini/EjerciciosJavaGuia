/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3;

import Servicio.ArregloServicio;

/**
 *
 * @author dgalm
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arregloA = new int[50];
        int[] arregloB = new int[20];

        ArregloServicio.inicializarA(arregloA);
        System.out.println("Arreglo A:");
        ArregloServicio.mostrar(arregloA);

        ArregloServicio.ordenar(arregloA);
        System.out.println("Arreglo A ordenado de mayor a menor:");
        ArregloServicio.mostrar(arregloA);

        //ArregloServicio.inicializarB(arregloA, arregloB);
        System.out.println("De nuevo, Arreglo A:");
        ArregloServicio.mostrar(arregloA);
        System.out.println("Arreglo B:");
        ArregloServicio.mostrar(arregloB);
    }
    
}
