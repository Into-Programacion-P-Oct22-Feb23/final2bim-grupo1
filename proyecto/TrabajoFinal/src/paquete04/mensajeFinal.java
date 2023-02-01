/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author USUARIO
 */
public class mensajeFinal {

    public static String ObtenerMensaje(int a) {

        String[] mensajeFinal = {"Campaña con poca afluencia", "Campaña moderada siga"
            + " adelante", "Excelente campaña"};

        if (a >= 1 && a <= 5) {
            return mensajeFinal[0];
        } else {
            if (a >= 6 && a <= 15) {
                return mensajeFinal[1];
            } else {
                if (a >= 16) {
                    return mensajeFinal[3];
                }
            }
        }
        return null;
    }
}
