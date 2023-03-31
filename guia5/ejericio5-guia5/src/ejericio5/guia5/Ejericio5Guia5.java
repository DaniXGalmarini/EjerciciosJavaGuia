/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejericio5.guia5;

import java.util.Scanner;

/**
 *
 * @author dgalm
 */
public class Ejericio5Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
//Definición de matrices y tamaño
        int[][] matriz1 = new int[3][3];
//Enunciado 1
        System.out.println("Ingrese los elementos Matriz.");
//Carga los datos de la primera matriz
        matriz1 = cargarMatriz(matriz1);
//Muestra la primera matriz cargada
        mostrarMatriz(matriz1);
//Convierte primera matriz en -AT y se compara con la matriz 2.
        if (sonIguales(traspuestaNegada(matriz1), matriz1)) {
            System.out.println("La matriz es antisimétrica.");
        } else {
            System.out.println("La matriz no es antisimétrica.");
        }
    }

//Funciones y subprogramas
//Mostrar matriz
    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println("");
        }
    }
//Cargar matriz
    public static int[][] cargarMatriz(int[][] matriz) {
        Scanner leer = new Scanner(System.in);
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz[0].length; i++) {
                System.out.println("Ingrese elemento " + (i + 1) + " de la fila " + (j + 1) + ":");
                matriz[j][i] = leer.nextInt();
            }
        }
        return matriz;
    }
//Genera Matriz -AT.  
    public static int[][] traspuestaNegada(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] traspuesta = new int[columnas][filas];
        //Se invierten filas por columnas
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                traspuesta[j][i] = -(matriz[i][j]);
            }
        }

        return traspuesta;
    }
//Compara dos matrices para ver si son iguales
    public static boolean sonIguales(int[][] matriz1, int[][] matriz2) {
        /*// Verificar si las matrices tienen la misma longitud
        if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) {
            return false;
        }*/

        // Verificar si cada elemento en la misma posición es igual
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                if (matriz1[i][j] != matriz2[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}