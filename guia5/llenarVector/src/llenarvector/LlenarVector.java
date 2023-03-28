/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llenarvector;

/**
 *
 * @author dgalm
 */
public class LlenarVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        llenarVector();
        
    }
    
    public static int[] llenarVector(){
        
        int[] vector = new int[100];
        
        for (int i = 0; i < 100; i++) {
            vector[i] = i;
        }
        
        mostrarVector(vector);
        
        return vector;
    }
    
    public static void mostrarVector(int[] vector){
        
        for (int i = 99; i >= 0; i--) {
            System.out.println(vector[i]);
        }
        
    }
}