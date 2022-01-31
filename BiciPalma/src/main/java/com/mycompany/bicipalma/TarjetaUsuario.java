/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bicipalma;

import java.util.*;
import java.util.stream.*;

/**
 *
 * @author PORTATIL
 */
public class TarjetaUsuario {

    private int idTarjeta;
    private boolean tarjetaActivada;

    public TarjetaUsuario() {
    }

    public int getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(int idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public boolean isTarjetaActivada() {
        return tarjetaActivada;
    }

    public void setTarjetaActivada(boolean tarjetaActivada) {
        this.tarjetaActivada = tarjetaActivada;
    }

    public TarjetaUsuario(int idTarjeta, boolean tarjetaActivada) {
        this.idTarjeta = idTarjeta;
        this.tarjetaActivada = tarjetaActivada;
    }

    public boolean leerTarjeta(Object[] tarjeta, String id) {
        String busqueda;
        boolean flagActive = false;
        String[] palabras;
        boolean flag = false;
        for (int x = 0; x < tarjeta.length; x++) {
            busqueda = tarjeta[x].toString();
            palabras = id.split("\\s+");
            if (!flag) {
                for (String palabra : palabras) {
                    if (busqueda.contains(palabra) && busqueda.contains("true")) {
                        System.out.println("Tarjeta activada");
                        flagActive = true;
                        flag = true;
                    } else if ((busqueda.contains(palabra) && busqueda.contains("false"))) {
                        System.out.println("Tarjeta desactivada");
                    }
                }
            }

        }
        if (!flag) {
            System.out.println("ID no encontrado");
        }
        return flagActive;
    }

    public boolean ComprobarTarjeta(Object[] tarjeta, String id) {
        String busqueda;
        boolean flagActive = false;
        String[] palabras;
        boolean flag = false;
        for (int x = 0; x < tarjeta.length; x++) {
            busqueda = tarjeta[x].toString();
            palabras = id.split("\\s+");
            if (!flag) {
                for (String palabra : palabras) {
                    if (busqueda.contains(palabra) && busqueda.contains("true")) {
                        flagActive = true;
                        flag = true;
                    } else if ((busqueda.contains(palabra) && busqueda.contains("false"))) {
                        flag = true;
                    }
                }
            }

        }
        if (!flag) {
            System.out.println("ID no encontrado");
        }
        return flagActive;
    }

    @Override
    public String toString() {
        return "TarjetaUsuario{" + "idTarjeta=" + idTarjeta + ", tarjetaActivada=" + tarjetaActivada + '}';
    }

    public String isActivada() {
        return "" + tarjetaActivada + "";
    }

}
