/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.time.Period;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author dgalm
 */
public class FechaService {
    Scanner leer = new Scanner(System.in);
//    Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. 
//            Luego los pase por parámetro a un nuevo objeto Date. 
//    El método debe retornar el objeto Date. 
//            Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
    
    public Date fechaNacimiento(){
        System.out.println("Ingrese dia de nacimiento");
        int dia=leer.nextInt();
        System.out.println("Ingrese mes de nacimiento");
        int mes=leer.nextInt();
        System.out.println("Ingrese año de nacimiento");
        int anio=leer.nextInt();
        Date f=new Date(anio-1900,mes-1,dia);
        return f;
    }
//    
//    Método fechaActual que cree un objeto fecha con el día actual. 
//            Para esto usaremos el constructor vacío de la clase Date
//                    . Ejemplo: Date fechaActual = new  Date();
    public Date fechaActual(){
        Date fechaActual= new Date();
        return fechaActual;
    }
//    
//    Método diferencia que reciba las dos fechas por parámetro 
//            y retorna la diferencia de años entre una y otra (edad del usuario).

    public void diferencia(Date a, Date b){
        System.out.println("La diferencia de años es:" + (b.getYear()-a.getYear()));
      }
    

}
