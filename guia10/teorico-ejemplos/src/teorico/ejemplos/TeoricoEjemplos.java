/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teorico.ejemplos;

import entidad.persona;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;
import servicios.personaServicios;

/**
 *
 * @author dgalm
 */
public class TeoricoEjemplos {

    /**
     * @param args the command line arguments
     */
   static Scanner leer = new Scanner(System.in);    
    public static void main(String[] args) {
       ArrayList<String> listado = new ArrayList();
        TreeSet<Integer> nombre = new TreeSet();
        HashMap<Integer, String> personas = new HashMap();
//        
////        
//        for (int i = 0; i < 8; i++) {
//            listado.add("numero"+(i+100)); 
//            
//            nombre.add(i+10);
            
//            System.out.println("Ingrese dni");
//            int dni=leer.nextInt();
//            System.out.println("Ingrese nombre");
//            String nombres = leer.next();
//            personas.put(dni, nombres);
            
        
//        
//        
////        listado.forEach((num) -> {
////            System.out.println(num);
////       });
////
//        nombre.forEach((num2) -> {
//            System.out.println(num2);
//       });
////
//        for (Map.Entry<Integer,String> entry: personas.entrySet()){
//            System.out.println("DNI"+ entry.getKey()+ ", Nombre: "+ entry.getValue());
//        }
//////
//////  
////        personas.entrySet().forEach((entry) -> {
////            System.out.println("Documento="+entry.getKey()+" Nombre: "+entry.getValue());
////       });
////
////        for (String persona: personas.values()) {
////            System.out.println("Nombre" + persona);
////        }
////        
//    listado.remove(1);
//    
//listado.remove("numero100");
//
//
//   listado.forEach((num) -> {
//            System.out.println(num);
//       });

//
//
//      nombre.remove(12); 
//      
//          nombre.forEach((num2) -> {
//            System.out.println(num2);
//       });
//      
//      
//     personas.remove(114);
//        
//           listado.forEach((integer) -> {
//            System.out.println(integer);
//       });
//        
//        nombre.forEach((integer1) -> {
//            System.out.println(integer1);
//       });
//        11
//        personas.entrySet().forEach((entry) -> {
//            System.out.println("Documento="+entry.getKey()+" Nombre: "+entry.getValue());
//       });
        
//        ArrayList<String> lista2= new ArrayList();
//        lista2.add("Hola");
//        lista2.add("Chau");
//        lista2.add("Casa");
//        lista2.add("Pesa");
//        
//        for (String string : lista2) {
//            System.out.println(string);
//        }
//          System.out.println("---------------------------");
//      Collections.sort(lista2);
//      
//        for (String string : lista2) {
//            System.out.println(string);
//        }
//        System.out.println("---------------------------");
//      
//      Iterator it3=lista2.iterator();
//      while (it3.hasNext()){
//          System.out.println(it3.next()+" ");
//      }
//      
//      Iterator <String> it4=lista2.iterator();
//      while(it4.hasNext()){
//          if (it4.next().equals("Pedro")){
//              it4.remove();
//          }
//      }
//      System.out.println("---------------------------");
//       for (String string : lista2) {
//            System.out.println(string);
//        }
//       Iterator <Integer> it3=nombre.iterator();
//       while (it3.hasNext()){
//           if (it3.next()==16){
//               it3.remove();
//           }
//       }
//       
//               nombre.forEach((num2) -> {
//            System.out.println(num2);
//       });
       
        
//
//       
//      Iterator it=lista2.iterator();
//      
////        System.out.println("Elementos de la lista");
////        while (it.hasNext()){
////            System.out.println(it.next());
////        }
////        System.out.println("");
//         
//        System.out.println("BORRANDO");
//        while(it.hasNext()){
//            if(it.next().equals("Pesa")){
//                it.remove();
//            }
//        }
////
////
////
//        
//        for (String string : lista2) {
//            System.out.println(string);
//        }
////        Iterator it2=lista2.iterator();
////        System.out.println("Elementos de la lista");
////        while (it2.hasNext()){
////            System.out.println(it.next()+" ");
////        }
////        System.out.println("");
  //  ArrayList<persona> p1= new ArrayList();
    
   //HashSet <persona> p2=new HashSet() ;
   
   personaServicios ps= new personaServicios();
   TreeSet <persona>p3=new TreeSet <persona>(personaServicios.compararNombre);
   
       
    for (int i = 0; i < 3; i++) {
          p3.add(ps.cargarPersona());
        }
    
        for (persona object : p3) {
            System.out.println(object);
        }
           
       

    }

//---------------------------------------------------------------------------
    
     
   
     
     
}

