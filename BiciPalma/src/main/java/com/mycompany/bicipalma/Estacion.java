/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bicipalma;

/**
 *
 * @author PORTATIL
 */
public class Estacion {

    private int idEstacion = 50;
    private int numAnclajes = 5;
    private String direccion = "Calle son ros, 24";
    private Object[] anclajes = new Object[5];

    public int getIdEstacion() {
        return idEstacion;
    }

    public int getNumAnclajes() {
        return numAnclajes;
    }

    public String getDireccion() {
        return direccion;
    }

    public Object[] getAnclajes() {
        return anclajes;
    }

    public void consultarEstacion(int idEstacion, int numAnclajes, String direccion) {
        System.out.println("El id de la estacion " + idEstacion + " con direccion en la " + direccion + " y tiene " + numAnclajes + " anclajes");
    }

    public void anclajesLibres(Object[] anclajes) {
        int anclajesLibres = 0;
        for (int x = 0; x < anclajes.length; x++) {
            if (anclajes[x] == null) {
                anclajesLibres++;
            }
        }
        System.out.println("Hay " + anclajesLibres + " anclajes libres");
    }

    public void consultarAnclajes(Object[] anclajes) {
        for (int x = 0; x < anclajes.length; x++) {
            if (anclajes[x] == null) {
                System.out.println("El anclajes" + (x + 1) + " esta libre");
            } else {
                System.out.println("El anclajes" + (x + 1) + " esta ocupado por la bicleta " + anclajes[x].toString());
            }
        }
    }

    public void anclarBicicleta(Object[] anclajes, Object[] bicicleta) {
        boolean flagOcupada = false;
        int todoOcupado=0;
        for (int x = 0; x < anclajes.length; x++) {
            if (anclajes[x] == null && !flagOcupada) {
                int i = (int) (Math.random() * 5);
                anclajes[x] = bicicleta[i];
                mostrarBicicleta(x, i, bicicleta);
                flagOcupada = true;
            }else{
                todoOcupado++;
            }
            
            if (todoOcupado == anclajes.length) {
                System.out.println("Todos los anclajes estan ocupados");
            }
        }
    }
    
    public void retirarBicicleta(Object[] anclajes){
        boolean retirada = false;
        for (int x=0;x<anclajes.length;x++){
            if(anclajes[x] != null && !retirada){
                System.out.println("La bicicleta con id "+anclajes[x]+" Se ha retirado del anclaje "+(x+1));
                anclajes[x] = null;
                retirada=true;
            }
        }
    }

    private void mostrarBicicleta(int x, int i, Object[] bicicleta) {
        System.out.println("La bicicleta con id " + bicicleta[i].toString() + " se ha analcnado en el anclaje " + (x + 1));
    }
    
    

}
