/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class CrearFacebook {
    public static String obtenerCrearFacebook() {

        String cadena;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese su edad profavor");
        int edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad");
        String ciudad = entrada.nextLine();
        
       
        System.out.println("Ingrese el pais de donde es");
        String pais = entrada.nextLine();
        System.out.println("Ingrese el correo");
        String correo = entrada.nextLine();

        cadena = String.format("Usuario: %s\nEdad: %d\nCiudad: %s\nPais: "
                + "%s\nCorreo: %s\n",
                nombre,
                edad,
                ciudad,
                pais,
                correo);

        return cadena;

    }
}
