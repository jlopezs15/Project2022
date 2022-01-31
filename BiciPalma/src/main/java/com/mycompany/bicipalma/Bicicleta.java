/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bicipalma;

/**
 *
 * @author PORTATIL
 */
public class Bicicleta {
    private int idBicicleta;

    public int getIdBicicleta() {
        return idBicicleta;
    }

    public void setIdBicicleta(int idBicicleta) {
        this.idBicicleta = idBicicleta;
    }

    public Bicicleta(int idBicicleta) {
        this.idBicicleta = idBicicleta;
    }

    @Override
    public String toString() {
        return ""+idBicicleta+"";
    }
    
    
}
