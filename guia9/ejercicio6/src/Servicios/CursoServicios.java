/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Curso;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author dgalm
 */
public class CursoServicios {
 Scanner leer = new Scanner(System.in);
    public void cargarAlumnos(Curso d) {
       
        String[] alumno = new String[5];
        for (int i = 0; i < d.getAlumnos().length; i++) {
            System.out.println("Ingrese nombre del alumno:");
            alumno[i] = leer.next();
        }
        d.setAlumnos(alumno);
    }

//    Método crearCurso(): el método crear curso, le pide los valores de los 
//            atributos al usuario y después se le asignan a sus respectivos atributos 
//            para llenar el objeto Curso. En este método invocamos al método 
//            cargarAlumnos() para asignarle valor al atributo alumnos
    public void crearCurso (Curso d){
        System.out.println("Ingrese nombre del Curso");
        d.setNombreCurso(leer.next());
        System.out.println("Ingrese Cantidad Horas por dia");
        d.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingrese Cantidad Dias por semana");
        d.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Ingrese Turno");
        d.setTurno(leer.next());
        System.out.println("Ingrese precio por hora");
        d.setPrecioPorHora(leer.nextDouble());
        cargarAlumnos(d); 
    }
    
//    Método calcularGananciaSemanal(): este método se encarga de calcular
//            la ganancia en una semana por curso. Para ello, se deben multiplicar
//            la cantidad de horas por día, el precio por hora, la cantidad de alumnos y 
//            la cantidad de días a la semana que se repite el encuentro.

    public double calcularGanancia(Curso d){
        return d.getCantidadHorasPorDia()*d.getPrecioPorHora()*d.getCantidadDiasPorSemana()*d.getAlumnos().length;
    }

}
