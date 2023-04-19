/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio03;

import Entidades.Persona;
import Servicios.PersonaServicio;

/**
 * Realizar una clase llamada Persona en el paquete de entidades que tengan los siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), peso y altura. Si desea añadir algún otro atributo, puede hacerlo. Agregar constructores, getters y setters. En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos: a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano. b) Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y después se le asignan a sus respectivos atributos para llenar el objeto Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje c) Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1. A continuación, en la clase main hacer lo siguiente: ● Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es mayor de edad. ● Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays), para después calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores. Para esto, podemos crear unos métodos adicionales.
 *
 * @author pc
 */
public class Clase08e03 {

    public static void main(String[] args) {

        PersonaServicio p1 = new PersonaServicio();
        Persona[] pacientes = new Persona[4];
        int contmayor = 0, contmenor = 0, contimcP = 0, contimcM = 0, contimcE = 0;
        int CuantosIMC = 0;
        int CuantosIMCBajo = 0;
        int CuantosMayores = 0;

        for (int i = 0; i < pacientes.length; i++) {
            pacientes[i] = p1.crearPersona();

            if (p1.esMayorDeEdad(pacientes[i])) {
                System.out.println("El paciente es mayor de edad");
                CuantosMayores += 1;
            } else {
                System.out.println("Paceinte menor de edad");
            }

            int Exceso = p1.calcularIMC(pacientes[i]);
            if (Exceso < 0) {
                CuantosIMCBajo++;
                System.out.println("Paciente de bajo peso");
            } else if (Exceso > 0) {
                CuantosIMC++;
                System.out.println("Paciente de alto peso");
            } else {
                System.out.println("El Paciente tiene peso ideal");
            }
            System.out.println("Fin de paciente actual..");
        }

        System.out.println("Los Pacientes con bajo peso son : " + (CuantosIMCBajo * 100 / 4)
                + "\nLos pacientes con alto peso :" + (CuantosIMC * 100 / 4)
                + "\nLos Mayores de edad son " + CuantosMayores);

        boolean mayor[] = new boolean[4];
        int imc[] = new int[4];

        for (int i = 0; i < mayor.length; i++) {
            mayor[i] = p1.esMayorDeEdad(pacientes[i]);
        }
        for (int i = 0; i < imc.length; i++) {
            imc[i] = p1.calcularIMC(pacientes[i]);
        }
        for (int i = 0; i < 4; i++) {
            if (mayor[i] == true) {
                contmayor++;
            } else {
                contmenor++;
            }

        }

        for (int i = 0; i < imc.length; i++) {
            if (imc[i] > 0) {
                contimcP++;
            } else if (imc[i] < 0) {
                contimcM++;

            } else {
                contimcE++;
            }

        }
        System.out.println("LOS MAYORES DE EDAD SON:" + contmayor + " eso equivale al: " + (contmayor * 100 / 4) + "%");
        System.out.println("LOS MENORES DE EDAD SON:" + contmenor + " eso equivale al: " + (contmenor * 100 / 4) + "%");

        System.out.println("LAS PERSONAS CON PESO IDEAL SON: " + contimcE);
        System.out.println("LAS PERSONAS CON SOBREPESO SON: " + contimcP);
        System.out.println("LAS PERSONAS DEBAJO DE SU PESO SON: " + contimcM);

    }
}
