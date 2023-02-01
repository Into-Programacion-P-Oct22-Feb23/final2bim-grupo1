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
public class CrearInstagram {

    public static void obtenerCrearInstagram() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un nombre de usuario");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese su ciudad");
        String ciudad = entrada.nextLine();
        System.out.println("Ingrese el edad de donde es");
        int edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su correo electronico");
        String correo = entrada.nextLine();

        System.out.printf("Nombre usuario: %s\n Ciudad: %s\n"
                + "Edad: %d\nCorreo: %s\n", nombre,
                ciudad,
                edad,
                correo);

    }

}
