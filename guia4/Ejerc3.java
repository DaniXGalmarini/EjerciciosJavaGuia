/*
 Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
*/

package Guia4;

import java.util.Scanner;

public class Ejerc3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de euros a convertir:");
        double euros = leer.nextDouble();
        leer.nextLine();
        System.out.println("Introduzca la moneda a la que desea convertir (libras, dolares o yenes):");
        String moneda = leer.nextLine();
        convertirMoneda(euros, moneda);
    }

    public static void convertirMoneda(double euros, String moneda) {
        double cambio = 0;
        String mensaje = "";
        switch (moneda.toLowerCase()) {
            case "libras":
                cambio = euros * 0.86;
                mensaje = euros + " € son " + cambio + " libras";
                break;
            case "dolares":
                cambio = euros * 1.28;
                mensaje = euros + " € son " + cambio + " dolares";
                break;
            case "yenes":
                cambio = euros * 129.8;
                mensaje = euros + " € son " + cambio + " yenes";
                break;
            default:
                System.out.println("Moneda no válida");
                return;
        }
        System.out.println(mensaje);
    }
}
