/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad.Servicios;

import Entidad.Raices;

/**
 *
 * @author dgalm
 */
public class RaicesServicio {
    
    public double getDiscrimante(Raices r){
    return (Math.pow(r.getB(), 2)-4*r.getA()*r.getC());
}
    
}
