/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author dgalm
 */
public class ArregloServicio {

    public static void inicializarA(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] =(int) Math.round(Math.random() * 1000);
        }
    }

    public static void mostrar(int [] arreglo) {
        System.out.println(Arrays.toString(arreglo));
    }

    public static void ordenar(int[] arreglo) {
        Arrays.sort(arreglo);
        for (int i = 0; i < arreglo.length / 2; i++) {
            int temp = arreglo[i];
            arreglo[i] = arreglo[arreglo.length - i - 1];
            arreglo[arreglo.length - i - 1] = temp;
           // Arrays.sort(arreglo);
        }
    }

//    public static void inicializarB(int [] arregloA, int[] arregloB) {
//        for (int i = 0; i < 10; i++) {
//            arregloB[i] = arregloA[i];
//        }
//        Arrays.fill(arregloB, 10, arregloB.length, 5);
//    }
//}
