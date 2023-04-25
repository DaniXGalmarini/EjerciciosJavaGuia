/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Arrays;

/**
 *
 * @author dgalm
 */
public class ArregloServicios {

    public static void inicializarA(double[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Math.random() * 100;
        }
    }

    public static void mostrar(double[] arreglo) {
        System.out.println(Arrays.toString(arreglo));
    }

    public static void ordenar(double[] arreglo) {
        Arrays.sort(arreglo);
        for (int i = 0; i < arreglo.length / 2; i++) {
            double temp = arreglo[i];
            arreglo[i] = arreglo[arreglo.length - i - 1];
            arreglo[arreglo.length - i - 1] = temp;
        }
    }

    public static void inicializarB(double[] arregloA, double[] arregloB) {
        for (int i = 0; i < 10; i++) {
            arregloB[i] = arregloA[i];
        }
        Arrays.fill(arregloB, 10, arregloB.length, 0.5);
    }
}
//{
//
//    public void inicializarA(double[] a) {
//        Arrays.fill(a, Math.random() * 100);
//    }
//
//    public void mostrar(double[] a) {
//        System.out.println(Arrays.toString(a));
//    }
//    
//    public void ordenar(double [] a){
//        Arrays.sort(a);
//    }
//    
//    public void inicializarB(double [] a, double [] b){
//        for (int i = 0; i < b.length; i++) {
//            b[i]=a[i];
//        }
//        Arrays.fill(b, b.length+1,a.length , 0.5);
//    }
//}
