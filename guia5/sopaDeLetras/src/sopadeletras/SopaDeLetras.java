/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sopadeletras;

/**
 *
 * @author dgalm
 */
import java.util.Scanner;

public class SopaDeLetras {
    public static void main(String[] args) {
        try (Scanner Leer = new Scanner(System.in)) {
            char[][] SopaDeLetras = new char[20][20];
            String[] Palabras = new String[5];
            int[] Posiciones = new int[5];
            char[] Letras = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'}; //indice 0-25
            
            RellenarLetras(SopaDeLetras, Letras);
            CargaPalabras(Palabras, Leer);
            CargaPosiciones(Posiciones);
            UbicarPalabras(SopaDeLetras, Palabras, Posiciones);
          //  MostrarSopa(SopaDeLetras);
            for (int i = 0; i < SopaDeLetras.length; i++) {
                for (int j = 0; j < SopaDeLetras.length; j++) {
                    System.out.print(SopaDeLetras[i][j]+"  ");
                    
                }
                System.out.println("");                
            }
        }
    }
    

    public static void CargaPalabras(String[] a, Scanner reader) {
        for (int i = 0; i < a.length; i++) {
            do {
                System.out.println("Ingrese una palabra entre 3 y 5 letras: ");
                a[i] = reader.next();
            } while (a[i].length() < 3 || a[i].length() > 5);
        }
    }

    public static void CargaPosiciones(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random()*19+1);
        }
    }

    public static void RellenarLetras(char[][] a, char[] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = b[(int) (Math.random()*25+1)];
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("\n\n");
    }

    public static void UbicarPalabras(char[][] a, String[] b, int[] c) {
        for (int i = 0; i < b.length; i++) {
            int k = (int)(Math.random()*14+1);
            for (int j = 0; j < b[i].length(); j++) {
                a[c[i]][k] = b[i].charAt(j);
                k++;
            }
        }
    }

//    public static void MostrarSopa(char[][] a) {
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a.length; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println("");
//        }
//    }
 }
