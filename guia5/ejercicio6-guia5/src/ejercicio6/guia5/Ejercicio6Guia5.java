/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6.guia5;

import java.util.Scanner;

/**
 *
 * @author dgalm
 */
public class Ejercicio6Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear y cargar el cuadrado
        int[][] cuadrado = new int[3][3];
        System.out.println("Introduce los números del cuadrado mágico:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boolean validInput = false;
                while (!validInput) {
                    System.out.print("Fila " + (i + 1) + ", columna " + (j + 1) + ": ");
                    int num = sc.nextInt();
                    if (num >= 1 && num <= 9) {
                        cuadrado[i][j] = num;
                        validInput = true;
                    } else {
                        System.out.println("Número inválido, por favor introduce un número entre 1 y 9.");
                    }
                }
            }
        }

        // Comprobar si es un cuadrado mágico
        int sum = 0;
        boolean isMagic = true;
        // Suma de la primera fila
        for (int i = 0; i < 3; i++) {
            sum += cuadrado[0][i];
        }
        // Comprobar las filas restantes
        for (int i = 1; i < 3; i++) {
            int tempSum = 0;
            for (int j = 0; j < 3; j++) {
                tempSum += cuadrado[i][j];
            }
            if (tempSum != sum) {
                isMagic = false;
                break;
            }
        }
        // Comprobar las columnas
        for (int i = 0; i < 3; i++) {
            int tempSum = 0;
            for (int j = 0; j < 3; j++) {
                tempSum += cuadrado[j][i];
            }
            if (tempSum != sum) {
                isMagic = false;
                break;
            }
        }
        // Comprobar la diagonal principal
        int tempSum = 0;
        for (int i = 0; i < 3; i++) {
            tempSum += cuadrado[i][i];
        }
        if (tempSum != sum) {
            isMagic = false;
        }
        // Comprobar la diagonal secundaria
        tempSum = 0;
        for (int i = 0; i < 3; i++) {
            tempSum += cuadrado[i][2 - i];
        }
        if (tempSum != sum) {
            isMagic = false;
        }

        // Mostrar el resultado
        if (isMagic) {
            System.out.println("El cuadrado introducido es mágico.");
        } else {
            System.out.println("El cuadrado introducido no es mágico.");
        }
    }
}
