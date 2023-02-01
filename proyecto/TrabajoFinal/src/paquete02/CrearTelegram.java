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
public class CrearTelegram {
    public static void obtenerCrearTelegram() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un nombre de usuario");
        String nombreUsuario = entrada.nextLine();
        System.out.println("Ingrese su numero telefonico");
        int numero = entrada.nextInt();
        System.out.println("Ingrese su ciudad");
        String ciudad = entrada.nextLine();
        entrada.nextLine();
        System.out.println("Ingrese el pais de donde es");
        String pais = entrada.nextLine();
        System.out.println("Ingrese area de interes:");
        String area = entrada.nextLine();

        System.out.printf("Nombre usuario: %s\nNumero: %d\n"
                + "Ciudad: %s\nPais: %s\nArea de interes: %s\n",
                nombreUsuario,
                numero,
                ciudad,
                pais,
                area);

    }
}
