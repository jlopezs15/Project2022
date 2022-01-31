/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.bicipalma;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author PORTATIL
 */
public class PalmaBici {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables para metodo main
        int op;
        boolean salir = false;
        //Objetos 
        Scanner sc = new Scanner(System.in);
        Estacion metEstacion = new Estacion();
        TarjetaUsuario metTarjetas = new TarjetaUsuario();
        //Crear TarjetasUsuario       
        Object[] TarjetasUsuarios = crearTarjetas();
        //CrearBicicletas
        Object[] ListaBicicletas = crearBicicletas();
        //Lista Anclajes
        Object[] Anclajes = metEstacion.getAnclajes();
        while (!salir) {
            System.out.println("-----MENU-----");
            System.out.println("1-CONSULTAR ESTACION");
            System.out.println("2-ANCLAJES LIBRES");
            System.out.println("3-CONSULTAR ANCLAJES");
            System.out.println("4-ANCLAR BICICLETA");
            System.out.println("5-LEER TARJETA USUARIO");
            System.out.println("6-RETIRAR BICICLETA");
            System.out.println("7-SALIR");
            try {
                System.out.println("ELIGE UNA OPCION");
                op = sc.nextInt();
                switch (op) {
                    case 1:
                        metEstacion.consultarEstacion(metEstacion.getIdEstacion(), metEstacion.getNumAnclajes(), metEstacion.getDireccion());
                        break;
                    case 2:
                        metEstacion.anclajesLibres(Anclajes);
                        break;
                    case 3:
                        metEstacion.consultarAnclajes(Anclajes);
                        break;
                    case 4:
                        metEstacion.anclarBicicleta(Anclajes, ListaBicicletas);
                        break;
                    case 5:
                        String id = "";
                        boolean correcto = false;

                        do {
                            try {
                                System.out.println("---------Ingrese su id-------------");
                                id = sc.next();
                                correcto = true;
                            } catch (Exception e) {
                                System.out.println("Por favor, ingrese un dato valido");
                            }
                        } while (!correcto);

                        metTarjetas.leerTarjeta(TarjetasUsuarios, id);
                        break;
                    case 6:
                        boolean flag = false;
                        String cadena = "";
                        do {
                            try {
                                System.out.println("---------Ingrese su id-------------");
                                id = sc.next();
                                flag = true;
                            } catch (Exception e) {
                                System.out.println("Por favor, ingrese un dato valido");
                            }
                        } while (!flag);
                        boolean active = metTarjetas.ComprobarTarjeta(TarjetasUsuarios, cadena);
                        if (active) {
                            metEstacion.retirarBicicleta(Anclajes);
                        } else {
                            System.out.println("Targeta desactiva no puede retirar la bicicleta");
                        }

                        break;
                    case 7:
                        salir = true;
                        System.out.println("HASTA PRONTO!");
                        break;
                    default:
                        System.out.println("ELIGE UNA OPCION VALIDA");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sc.next();
            }

        }

    }

    public static TarjetaUsuario[] crearTarjetas() {
        TarjetaUsuario[] arrTarjeta = new TarjetaUsuario[5];
        arrTarjeta[0] = new TarjetaUsuario(123456789, true);
        arrTarjeta[1] = new TarjetaUsuario(234567891, false);
        arrTarjeta[2] = new TarjetaUsuario(345678912, true);
        arrTarjeta[3] = new TarjetaUsuario(456789123, false);
        arrTarjeta[4] = new TarjetaUsuario(567891234, true);
        return arrTarjeta;
    }

    public static Bicicleta[] crearBicicletas() {
        Bicicleta[] arrBicicleta = new Bicicleta[6];
        arrBicicleta[0] = new Bicicleta(123);
        arrBicicleta[1] = new Bicicleta(234);
        arrBicicleta[2] = new Bicicleta(345);
        arrBicicleta[3] = new Bicicleta(456);
        arrBicicleta[4] = new Bicicleta(567);
        arrBicicleta[5] = new Bicicleta(678);
        return arrBicicleta;
    }

}
