/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class CrearSignal {
    public static String obtenerCrearSignal() {
        String cadena = "";

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un nombre de usuario");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese su numero telefonico");
        int numero = entrada.nextInt();
         entrada.nextLine();
        System.out.println("Ingrese su ciudad");
        String ciudad = entrada.nextLine();
        
        System.out.println("Ingrese el pais de donde es");
        String pais = entrada.nextLine();
        System.out.println("Ingrese su hobby principal");
        String hobby = entrada.nextLine();

        cadena = String.format("%sNombre usuario: %s\nNumero: %d\n"
                + "Ciudad: %s\nPais: %s\nHobby principal: %s\n", cadena,
                nombre,
                numero,
                ciudad,
                pais,
                hobby);
        return cadena;

    }
}
