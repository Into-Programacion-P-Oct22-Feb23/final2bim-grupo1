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
public class CrearTwitter {
    public static void obtenerCrearTwitter() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un nombre de usuario");
        String nombreUsuario = entrada.nextLine();
        System.out.println("Ingrese sus nombres completos");
        String nombres = entrada.nextLine();
        System.out.println("Ingrese sus apellidos completos");
        String apellidos = entrada.nextLine();
        System.out.println("ingrese su edad");
        int edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad");
        String ciudad = entrada.nextLine();
        System.out.println("Ingrese el pais de donde es");
        String pais = entrada.nextLine();
        System.out.println("Ingrese su idioma");
        String idioma = entrada.nextLine();
        System.out.println("Ingrese su correo Electronico");
        String correo = entrada.nextLine();

        System.out.printf("Nombre de usuario: %s\nNombres: %s\n"
                + "Apellidos: %s\nEdad: %d\nCiudad: %s\nPais: %s\n"
                + "Idioma: %s\nCorreo: %s\n",
                nombreUsuario,
                nombres,
                apellidos,
                edad,
                ciudad,
                pais,
                idioma,
                correo);

    }
    
}
