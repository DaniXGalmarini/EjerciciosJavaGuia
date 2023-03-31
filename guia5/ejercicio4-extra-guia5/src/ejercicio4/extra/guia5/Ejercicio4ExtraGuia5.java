/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.extra.guia5;

import java.util.Scanner;

/**
 *
 * @author dgalm
 */
public class Ejercicio4ExtraGuia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        double [] promedios = new double [10];
        double [] [] notas = new double [10][4];
        int desaprobados = 0;
        int aprobados = 0;
        //cargamos las notas
        for (int i = 0; i < notas.length; i++) {
             System.out.println("Ingrese las notas del "+ (i+1)+ " alumno");
            for (int j = 0; j < 4; j++) {
                notas[i][j] = leer.nextDouble();
            }  
        }
        //calcular porcentajes
        for (int i = 0; i < notas.length; i++) {
                 double promedio = notas[i][0] * 0.1 + notas[i][1] * 0.15 + notas[i][2] * 0.25 + notas[i][3] * 0.5;
                promedios[i] = promedio;
            }
            for (int i = 0; i < promedios.length; i++) {
           if (promedios[i]>=7){
              aprobados++;
           }else {
               desaprobados++;
           }     
        }
             System.out.println("La cantidad de alumnos aprobados: "+aprobados+"\nLa cantidad de alumnos desaprobados es: " + desaprobados);
    }
    
}
