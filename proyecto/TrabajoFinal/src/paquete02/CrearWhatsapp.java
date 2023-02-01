/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class CrearWhatsapp {
    public static String obtenerCrearWhatsApp() {
        String cadena;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un nombre de usuario");
        String nombreUsuario = entrada.nextLine();
        System.out.println("Ingrese su numero telefonico");
        int numero = entrada.nextInt();
        System.out.println("ingrese su edad");
        int edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad");
        String ciudad = entrada.nextLine();
        System.out.println("Ingrese el pais de donde es");
        String pais = entrada.nextLine();

        cadena = String.format("Nombre de usuario: %s\n"
                + "numero: %d\nEdad: %d\nCiudad: %s\nPais:%s\n",
                nombreUsuario,
                numero,
                edad,
                ciudad,
                pais);
        
        return cadena;

    }
}
