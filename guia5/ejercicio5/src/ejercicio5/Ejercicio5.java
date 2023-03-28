/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author dgalm
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {

        // Declaración de variables
        int[][] matriz = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        boolean antisimetrica = true;

        // Comprobar si la matriz es antisimétrica
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] != -matriz[j][i]) { //negativo
                    antisimetrica = false;
                    break;
                }
            }
            if (!antisimetrica) {
                break;
            }
        }

        // Mostrar el resultado
        if (antisimetrica) {
            System.out.println("La matriz es antisimétrica");
        } else {
            System.out.println("La matriz NO es antisimétrica");
         }
    }

}