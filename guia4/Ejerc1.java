/*
 * Crea una aplicación que le pida dos números al usuario y este pueda elegir 
entre sumar, restar, multiplicar y dividir. La aplicación debe tener una función 
para cada operación matemática y deben devolver sus resultados para imprimirlos en el main. 

 */
package Guia4;

import java.util.Scanner;

public class Ejerc1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double num1 = leer.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = leer.nextDouble();
        System.out.println("Elija una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("El resultado de la suma es: " + sumar(num1, num2));
                break;
            case 2:
                System.out.println("El resultado de la resta es: " + restar(num1, num2));
                break;
            case 3:
                System.out.println("El resultado de la multiplicación es: " + multiplicar(num1, num2));
                break;
            case 4:
                System.out.println("El resultado de la división es: " + dividir(num1, num2));
                break;
            default:
                System.out.println("Opción inválida");
        }
    }

    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public static double restar(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: no se puede dividir por cero");
            return Double.NaN; //se usa para representar un resultado q no es un num válido
        }
        return num1 / num2;
    }

}
