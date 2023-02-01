/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajofinal;
import java.util.Scanner;
import paquete01.CrearFacebook;
import paquete01.CrearTwitter;
import paquete02.CrearWhatsapp;
import paquete02.CrearTelegram;
import paquete03.CrearSignal;
import paquete03.CrearInstagram;
import paquete04.CrearFlickr;
import paquete04.mensajeFinal;


/**
 *
 * @author USUARIO
 */
public class MetodoPrincipal {

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
                    + "4 para Telegram\n5 para Signal\n"
                    + "6 para Instagram\n7 para Flickr");
            var = entrada.nextInt();

            entrada.nextLine();
            if (var == 1) {
                mensaje = CrearFacebook.obtenerCrearFacebook();

                System.out.printf("%s", mensaje);
            } else {
                if (var == 2) {
                    CrearTwitter.obtenerCrearTwitter();
                } else {
                    if (var == 3) {
                        mensaje = CrearWhatsapp.obtenerCrearWhatsApp();

                        System.out.printf("%s", mensaje);
                    } else {
                        if (var == 4) {
                            CrearTelegram.obtenerCrearTelegram();
                        } else {
                            if (var == 5) {
                                mensaje = CrearSignal.obtenerCrearSignal();
                                System.out.printf("%s", mensaje);
                            } else {
                                if (var == 6) {
                                    CrearInstagram.obtenerCrearInstagram();
                                } else {
                                    if (var == 7) {
                                        mensaje = CrearFlickr.obtenerCrearFlickr();
                                        System.out.printf("%s", mensaje);
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
        System.out.printf("Se ha crado un total de %d Cuentas\n",
                contador);
        serie = mensajeFinal.ObtenerMensaje(contador);
        System.out.println(serie);
    }
}

