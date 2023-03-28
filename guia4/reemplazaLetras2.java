/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia4;

import java.util.Scanner;

public class reemplazaLetras2 {

        public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese una palabra o frase y termine con un punto (.)");
            String entrada = leer.nextLine().toLowerCase();

            String vocales = "aeiouáéíóúü";
            String reemplazadas = "@#$%*";

            String salida = "";
            for (int i = 0; i < entrada.length() - 1; i++) {
                char c = entrada.charAt(i); //se crea una variable c de tipo char y se le asigna el carácter en la posición i de la cadena entrada.
                if (vocales.indexOf(c) != -1) {
                    //verifica para ver si el carácter
                    //c es una vocal. usando indexOf() de la cadena vocales, 
                    //que devuelve la posición de la primera letra del carácter 
                    //c en la cadena vocales. Si el carácter no esta, 
                    //devuelve -1. osea, si el resultado de indexOf() es diferente 
                    //de -1, se entiende que el carácter c es una vocal.
                    int indice = vocales.indexOf(c); //Si el carácter c es una vocal, se busca su posición en la cadena vocales y se almacena en la variable indice
                    char reemplazadasChar = reemplazadas.charAt(indice);
                    salida = salida.concat(Character.toString(reemplazadasChar));
                } else {
                    salida = salida.concat(Character.toString(c));
                }
            }
            salida = salida.concat(".");

            System.out.println("Entrada: " + entrada);
            System.out.println("Salida: " + salida);
        }
    }
/*
concatenar se usa para concatenar dos cadenas. Toma una cadena como argumento y
la agrega al final de la cadena actual, dev una nueva cadena que es la combinación de las dos.
public String concat(String str)
str es la cadena que se concatenará a la cadena actual.
String str1 = "Hola";
String str2 = "Mundo";
String str3 = str1.concat(str2);

System.out.println(str3);
 tres variables de tipo String. se llama al método concat() en la variable str1 
pasando str2 como argumento. El resultado se almacena en la variable str3, que 
contiene la cadena resultante "HolaMundo".
*/