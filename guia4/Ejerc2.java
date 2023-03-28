/*
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los 
datos de las personas ingresadas por teclado e indique si son mayores o menores 
de edad. Después de cada persona, el programa debe preguntarle al usuario si 
quiere seguir mostrando personas y frenar cuando el usuario ingrese 
la palabra “No”.

 */
package Guia4;

import java.util.Scanner;

public class Ejerc2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = pedirCantidadPersonas(scanner);
        for (int i = 1; i <= n; i++) { //se va haciendo segun la cant de personas
            System.out.println("Ingrese el nombre de la persona " + i + ":");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese la edad de " + nombre + ":");
            int edad = scanner.nextInt();
            scanner.nextLine(); //se limpia el scanner
            imprimirPersona(nombre, edad);
            if (esMayorDeEdad(edad)) {
                System.out.println(nombre + " es mayor de edad");
            } else {
                System.out.println(nombre + " es menor de edad");
            }
            System.out.println("¿Desea mostrar otra persona? (Sí/No)");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("No")) {
                break; //no, sale del ciclo
            }
        }
    }

    public static int pedirCantidadPersonas(Scanner scanner) {
        int cantidad;
        do {
            System.out.println("Ingrese la cantidad de personas:");
            cantidad = scanner.nextInt();
            scanner.nextLine();
        } while (cantidad <= 0);
        return cantidad;
    }

    public static void imprimirPersona(String nombre, int edad) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public static boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }

}
