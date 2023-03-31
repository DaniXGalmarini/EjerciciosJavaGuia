/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sopadeletra;

import java.util.Random;
import java.util.Scanner;

/**
 *Construya un programa que lea 5 palabras de mínimo 3 y 
 * hasta 5 caracteres y, a medida que el usuario las va ingresando,
 * construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres.
 * Las palabras se ubicarán todas en orden horizontal en una fila que 
 * será seleccionada de manera aleatoria. Una vez concluida la ubicación 
 * de las palabras, rellene los espacios no utilizados con un número 
 * aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras creada.

* Nota: Para resolver el ejercicio deberá 
* investigar cómo se utilizan las siguientes 
* funciones de Java substring(), Length() y Math.random().

 * @author dgalm
 */
public class Sopadeletra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);    
        String[] palabras=new String [5];
        String [][] sopa=new String[20][20];
        int[] posicionF = new int[5];
        int[] posicionC = new int[5];
        cargarvector(palabras, leer);
        
        crearMatriz(sopa);
        
        crearPosiciones(posicionF,posicionC);
        
        llenarMatriz(sopa,posicionF,palabras, posicionC);
          
        mostrarMatriz(sopa);
     

    }
    public static void cargarvector(String[] a, Scanner leer){
        String palAux;
        for (int i = 0; i < a.length; i++) {
            do{
                System.out.println("Ingrese la palabra en la posicion "+(i+1));
                palAux=leer.nextLine();
                a[i]=palAux;
            }while (palAux.length()<3 || palAux.length()>5);
            
        }
    }
    
    public static void crearMatriz(String[][] sopa){
         for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa.length; j++) {
                sopa[i][j]= String.valueOf((int) (Math.random()*10));
                
            }
            
        }
    }
    
    public static void crearPosiciones(int[]a, int[]b){
         Random generador=new Random();
        for (int i = 0; i < a.length; i++) {  
            a[i]=generador.nextInt(20);
            
        }
              for (int i = 0; i < b.length; i++) {  
            b[i]=generador.nextInt(20);
            
        }
    }
    
    public static void llenarMatriz(String[][]a, int[]pF, String[] p, int[]pC){
       //PREGUNTAMOS POR LA COLUMNA. SI EL VALOR ALEATORIO MAS EL LARGO DE LA PALABRA SON MENOR A 20 ENTRA BIEN. SINO
       //RESTAMOS EL TAMAÑO DE LA PALABRA A 19 PARA ASEGURARNOS QUE ENTRE
        for (int i = 0; i < pC.length; i++) {
            if (pC[i]+p[i].length()<19){
                break;
            }else {
                pC[i]=19-p[i].length();
            }        
        }
 
        for (int i = 0; i < 5; i++) {
           for (int j = 0; j < p[j].length(); j++)  {
                  a[pF[i]] [pC[i]] =  p[i].substring(j, j+1);  
                  pC[i]++;
              }
                                  
            }
            
        
    }
    
    public static void mostrarMatriz(String[][]s){
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < s.length; j++) {
                System.out.print(" "+s[i][j]+" ");
                
            }
            System.out.println("");
        }
    }
}
