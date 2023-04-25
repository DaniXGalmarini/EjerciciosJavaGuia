/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author dgalm
 */
public class CadenaServicio {
    
//    Método mostrarVocales(), deberá contabilizar la cantidad 
    //de vocales que tiene la frase ingresada.
    Scanner leer = new Scanner(System.in);    
    Cadena x= new Cadena("La casa es linda");
    
    
    public void mostrarVocales(){
        int contVocal=0;
        for (int i = 0; i < x.getLongitud(); i++) {
            if (x.getFrase().charAt(i)=='a' || x.getFrase().charAt(i)=='e' || x.getFrase().charAt(i)=='i'|| x.getFrase().charAt(i)=='o'|| x.getFrase().charAt(i)=='u'){
                contVocal++;
            } 
            
        }
        System.out.println("La palabra tiene "+contVocal+" vocales.");
    }
    
//    Método invertirFrase(), deberá invertir la frase ingresada y
//            mostrarla por pantalla. Por ejemplo: 
//            Entrada: "casa blanca", Salida: "acnalb asac".
    
    public void invertirFrase(){
        String frase2="";
        for (int i = x.getLongitud()-1; i >= 0; i--) {
            frase2+=x.getFrase().charAt(i);
        }
        System.out.println(frase2);
    }

////    Método vecesRepetido(String letra), recibirá un carácter 
//    ingresado por el usuario y contabilizar cuántas veces se 
//            repite el carácter en la frase, por ejemplo:
////Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.

       public void vecesRepetido(){
           int contadorletra=0;
           System.out.println("Ingrese el caracter a buscar");
           char car=leer.next().charAt(0);
           for (int i = 0; i < x.getLongitud(); i++) {
            if (x.getFrase().charAt(i)==car){
                contadorletra++;
            }
                
            }
           System.out.println("La letra aparece: "+ contadorletra+" veces");
       }
//    Método compararLongitud(String frase), 
//            deberá comparar la longitud de la frase 
//            que compone la clase con otra nueva frase ingresada por el usuario.
       
       public void compararLongitud(String frase){
           if (x.getLongitud() == frase.length()) {
               System.out.println("Las frases tienen la misma longitud");
           } else if (x.getLongitud() > frase.length()) {
               System.out.println("La longitud de la primer frase es mayor");
           } else {
               System.out.println("La longitud de la primer frase es menor");

           }
       }
       
//       Método unirFrases(String frase), 
//               deberá unir la frase contenida en 
//               la clase Cadena con una nueva frase ingresada por 
//               el usuario y mostrar la frase resultante.
       public void unirFrases(String frase){
           String nueva=x.getFrase().concat(frase);
           System.out.println("La frase nueva es:"+ nueva);
       }

//       Método reemplazar(String letra), deberá reemplazar
//               todas las letras “a” que se encuentren en la 
//               frase, por algún otro carácter seleccionado por 
//               el usuario y mostrar la frase resultante.

       public void reemplazar(String letra){
          
           System.out.println("LA FRASE REEMPLAZADA ES: "+ x.getFrase().replaceAll("a", letra));  
       }
       
//       Método contiene(String letra), deberá comprobar
//               si la frase contiene una letra que 
//               ingresa el usuario y devuelve verdadero si la contiene y falso si no.
       
       public boolean contiene(String letra){
          return  x.getFrase().contains(letra);
       }

}
