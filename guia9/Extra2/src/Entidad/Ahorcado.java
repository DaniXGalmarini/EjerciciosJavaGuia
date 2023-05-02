/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author dgalm
 */
public class Ahorcado {
    
    String [] palabra;
    int cantLetrasEncontradas;
    int cantiJugadasMax;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int cantLetrasEncontradas, int cantiJugadasMax) {
        this.palabra = palabra;
        this.cantLetrasEncontradas = cantLetrasEncontradas;
        this.cantiJugadasMax = cantiJugadasMax;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getCantLetrasEncontradas() {
        return cantLetrasEncontradas;
    }

    public void setCantLetrasEncontradas(int cantLetrasEncontradas) {
        this.cantLetrasEncontradas = cantLetrasEncontradas;
    }

    public int getCantiJugadasMax() {
        return cantiJugadasMax;
    }

    public void setCantiJugadasMax(int cantiJugadasMax) {
        this.cantiJugadasMax = cantiJugadasMax;
    }
    
    
    
    
}
