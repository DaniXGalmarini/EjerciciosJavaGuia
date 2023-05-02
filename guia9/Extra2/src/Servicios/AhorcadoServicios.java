/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author dgalm
 */
public class AhorcadoServicios {
    
//    Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. 
//    Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. 
//    Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra 
//    en un índice del vector. Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.
    public void crearJuego(Ahorcado d){
        Scanner leer = new Scanner(System.in);        
        System.out.println("Ingrese la palabra a adivinar");
        String palabra=leer.next();
        int longitud=palabra.length();
        System.out.println("En cuantos intentos se debe adivinar la palabra?");
        int intentos=leer.nextInt();
        String [] pal=new String [longitud];
        for (int i = 0; i < pal.length; i++) {
            pal[i]=palabra.substring(i, i+1);
        }
        d.setPalabra(pal);
        d.setCantiJugadasMax(intentos);
        d.setCantLetrasEncontradas(0);
    }
    
//    Método longitud(): muestra la longitud de la palabra 
//    que se debe encontrar. Nota: buscar como se usa el vector.length.
    
    public int longitud (Ahorcado a){
        return a.getPalabra().length;
    }
    
//    Método buscar(letra):  este método recibe una letra dada por el usuario 
//    y busca si la letra ingresada es parte de la palabra o no. 
//    También informará si la letra estaba o no.
   
    public void buscar(Ahorcado d, String l){
         int contadorletras=0;
        for (int i = 0; i < longitud(d); i++) {
           if (d.getPalabra()[i].equalsIgnoreCase(l)){
               contadorletras++;
           }
        }
        if (contadorletras>0){
                     
             System.out.println("LA LETRA FORMA PARTE DE LA PALABRA");
        }else {
            System.out.println("LA LETRA NO FORMA PARTE DE LA PALABRA");
        }
    }
    
//            Método encontradas(letra):  que reciba una letra ingresada 
//            por el usuario y muestre cuantas letras han sido encontradas 
//            y cuántas le faltan. Este método además deberá devolver true 
//            si la letra estaba y false si la letra no estaba, ya que, 
//            cada vez que se busque una letra que no esté, se le restará 
//            uno a sus oportunidades.

    
    public boolean encontradas(Ahorcado d, String l){
        int contadorletras=0;
        for (int i = 0; i < d.getPalabra().length; i++) {
           if (d.getPalabra()[i].equalsIgnoreCase(l)){
               contadorletras++;
           }
        }
        if (contadorletras>0){
             System.out.println("LA LETRA "+l+" APARECE "+contadorletras);
             return true;
        }else {
            System.out.println("LA LETRA "+l+" NO APARECE EN LA PALABRA");
            return false;
        }
    }

    // Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
    public int intentos(Ahorcado e, int f) {
        return e.getCantiJugadasMax() - f;
    }

//    Método juego(): el método juego se encargará de llamar todos 
//    los métodos previamente mencionados e informará cuando 
//    el usuario descubra toda la palabra o se quede sin intentos. 
//    Este método se llamará en el main.
    public void juego() {
        Scanner leer = new Scanner(System.in);
        int contadorintentos = 0;
        Ahorcado d = new Ahorcado();
        crearJuego(d);
        do {

            System.out.println("Ingrese una letra a adivinar:");

            String letra = leer.next();
        
            System.out.println("LA LONGITUD DE LA PALABRA ES:" + longitud(d));
            if (encontradas(d, letra) == true) {
                int cant = d.getCantLetrasEncontradas() + 1;
                d.setCantLetrasEncontradas(cant);
                contadorintentos++;
                System.out.println("LE QUEDAN " + intentos(d, contadorintentos) + " INTENTOS");
            } else {
                contadorintentos++;
                System.out.println("LE QUEDAN " + intentos(d, contadorintentos) + " INTENTOS");
            }
            
        } while (d.getCantiJugadasMax() > contadorintentos);
                 
    }
}