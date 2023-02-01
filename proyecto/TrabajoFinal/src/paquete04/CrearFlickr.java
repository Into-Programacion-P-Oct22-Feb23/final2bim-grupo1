/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class CrearFlickr {
    public static String obtenerCrearFlickr() {

        String cadena;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un nombre de usuario");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese su correo electronico");
        String correo = entrada.nextLine();

        cadena = String.format("Nombre usuario: %s\nCorreo Electronico: "
                + "%s\n",
                nombre,
                correo);

        return cadena;

    }
}
