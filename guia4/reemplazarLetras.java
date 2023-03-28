/*
 *Escribir un programa que procese una secuencia de caracteres ingresada por 
teclado y terminada en punto, y luego codifique la palabra o frase ingresada 
de la siguiente manera: cada vocal se reemplaza por el carácter que se indica 
en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas)
se mantienen sin cambios.
a e i o u @ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la 
codificación correspondiente. Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */
package Guia4;

import java.util.Scanner;

public class reemplazarLetras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una secuencia de caracteres (terminada en punto): ");
        String cadena = leer.nextLine();
        String codificada = codificar(cadena); // llama a la función codificar y guarda el resultado en una variable q se llama codificada
        System.out.println("Cadena codificada: " + codificada); //el resultado de la codificación
    }

    public static String codificar(String cadena) {
        // función codificar toma una cadena como entrada y 
        //devuelve otra cadena como salida. La función va a través de 
        //cada caracter de la cadena de entrada y lo transforma según el simbolo, 
        //devuelve la cadena transformada.
        String codificada = "";
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i); 
            switch (caracter) {
                case 'a':
                    codificada += "@";
                    break;
                case 'e':
                    codificada += "#";
                    break;
                case 'i':
                    codificada += "$";
                    break;
                case 'o':
                    codificada += "%";
                    break;
                case 'u':
                    codificada += "*";
                    break;
                case 'á':
                    codificada += "@";
                    break;
                case 'é':
                    codificada += "#";
                    break;
                case 'í':
                    codificada += "$";
                    break;
                case 'ó':
                    codificada += "%";
                    break;
                case 'ú':
                    codificada += "*";
                    break;
                default:
                    codificada += caracter;
            }
        }
        return codificada;
    }
}
//La función codificar empieza definiendo una cadena vacía llamada codificada que 
//se va a usar para ir almacenando el resultado de la codificación. el ciclo for 
//para ver cada caracter de la cadena de entrada y en cada vuelta, se toma el 
//caracter usando charAt y se lo asigna a la variable caracter.
//charAt es una función que se usa para tener un carácter 
//específico de una cadena en una posición determinada.
//char caracter = cadena.charAt(indice);
//cadena es la cadena de caracteres en la que se busca el carácter, indice es 
//la posición en la cadena del carácter que se quiere tener y caracter es la 
//variable en la que se guarda el carácter obtenido.

/*
Una función en Java es una porción de código que se encarga de realizar una tarea  y 
devuelve un valor que puede ser utilizado en otra parte del programa. 
Para crear una función, primero debemos definir el tipo de dato que devuelve la función.
Por ejemplo, si queremos crear una función que calcule el área de un círculo y devuelva un valor decimal,
debemos definir que la función devuelve un valor de tipo "double". Luego, se debe definir el nombre de 
la función y los parámetros que recibe (si los hay). Por ejemplo:
public static double calcularAreaCirculo(double radio) {
    double area = Math.PI * radio * radio;
    return area;
}
una función llamada calcularAreaCirculo que recibe un parámetro de tipo double llamado radio.
En la implementación de la función, se calcula el área del círculo usando la fórmula π * r^2 
( r es el radio) y se guarda en una variable llamada area. return para devolver el valor de "area".
Para usar la función en otra parte del programa, solo llamarla
*/