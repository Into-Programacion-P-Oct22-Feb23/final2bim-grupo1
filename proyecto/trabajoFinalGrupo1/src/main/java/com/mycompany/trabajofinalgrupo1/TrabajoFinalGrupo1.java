/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.trabajofinalgrupo1;

import java.util.Scanner;

/**
 *
 * @author aysanchez6
 */
public class TrabajoFinalGrupo1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String opcion;
        boolean bandera = true;
        int var;
        int contador = 0;
        String serie;
        String mensaje;
        while (bandera) {
            System.out.println("Ingrese:\n1 para cuenta en Facebook\n"
                    + "2 para Twitter\n3 para WhatsApp\n"
                    + "4 para Telegram\n5 para Signal\n "
                    + "6 para Instagram\n7 para Flickr ");
            var = entrada.nextInt();
            
            entrada.nextLine();
            if (var == 1) {
               mensaje = ObtenerCrearFacebook();

                System.out.printf("%s",mensaje);
            } else {
                if (var == 2) {
                    obtenerCrearTwitter();
                } else {
                    if (var == 3) {
                        mensaje = obtenerCrearWhatsApp();
                        
                        System.out.printf("%s",mensaje);
                    } else {
                        if (var == 4) {
                            obtenerCrearTelegram();
                        } else {
                            if (var == 5) {
                              mensaje =  obtenerCrearSignal();
                               System.out.printf("%s",mensaje);
                            } else {
                                if (var == 6) {
                                    obtenerCrearInstagram();
                                } else {
                                    if (var == 7) {
                                       mensaje =  obtenrCrearFlickr();
                                        System.out.printf("%s",mensaje);
                                    } else {
                                        System.out.println("Error en opción seleccionada");
                                        contador = contador - 1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            contador = contador + 1;
            System.out.println("Ingrese (si) para salir");
            opcion = entrada.nextLine();

            if (opcion.equals("si")) {
                bandera = false;
            }
        }
        System.out.printf("Se ha crado un total de %d Cuentas\t",
                contador);
        serie = ObtenerMensaje(contador);
        System.out.println(serie);
    }

    public static String ObtenerCrearFacebook() {

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

    public static String obtenrCrearFlickr() {

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
    
    public static String ObtenerMensaje (int a){
        
        String[] mensajeFinal = {"Campaña con poca afluencia","Campaña moderada siga"
        + " adelante", "Excelente campaña"};
        
        if (a  >= 1 && a <=5){
            return mensajeFinal[0];
        }else{
            if (a >=6 && a <= 15){
                return mensajeFinal[1];
            }else{
                if ( a >= 16){
                    return mensajeFinal[3];
                }
            }
        }
        return null;
        
        
        
    }

}
