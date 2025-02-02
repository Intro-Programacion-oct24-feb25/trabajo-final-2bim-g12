/** To change this license hea+der, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * */
package trabajofinal;

import java.util.Scanner;
import registroFutbol.registroFutbol;
import registroAtletismo.registroAtletismo;
import registroNatacion.registroNatacion;
import registroBasquetbol.registroBasquetbol;
import registroCiclismo.registroCiclismo;
import registroTenis.registroTenis;
import registroYoga.registroYoga;

/**
 *
 * @author ASUS
 */
public class Problema1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] areas = {"Futbol", "Natacion", "Atletismo", "Basquetbol", "Ciclismo", "Tenis", "Yoga"};
        int[] resultados = new int[7];
        int opcion;
        int numeroCuentas = 0;
        boolean bandera = true;
        while (bandera) {
            System.out.println("Ingrese la opcion a la que desea aplicar: ");
            for (int i = 0; i < areas.length; i++) {
                System.out.println((i + 1) + "." + "Para " + areas[i] + " ingrese: " + "(" + (i + 1) + ")");
            }
            opcion = entrada.nextInt();
            switch (opcion) {
                case (1):
                    registroFutbol.registrarParticipanteFutbol();
                    resultados[0] = resultados[0] + 1;
                    break;
                case (2):
                    registroNatacion.registrarParticipanteNatacion();
                    resultados[1] = resultados[1] + 1;
                    break;
                case (3):
                    registroAtletismo.registrarParticipanteAtletismo();
                    resultados[2] = resultados[2] + 1;
                    break;
                case (4):
                    registroBasquetbol.registrarParticipanteBasquetbol();
                    resultados[3] = resultados[3] + 1;
                    break;
                case (5):
                    registroCiclismo.registrarParticipanteCiclismo();
                    resultados[4] = resultados[4] + 1;
                    break;
                case (6):
                    registroTenis.registrarParticipanteTenis();
                    resultados[5] = resultados[5] + 1;
                    break;
                case (7):
                    registroYoga.registrarParticipanteYoga();
                    resultados[6] = resultados[6] + 1;
                    break;
                default:
                    System.out.println("Lo sentimos, el club no tiene esa opción");
                    bandera = false;
            }
            numeroCuentas += 1;
            System.out.println("¿Desea continuar? Seleccione: Si/No");
            entrada.nextLine();
            String continua = entrada.nextLine();
            switch (continua) {
                case ("No"):
                    bandera = false;
                    break;
            }

        } 

        obtenerInformacion(numeroCuentas);
        obtenerReporte(areas, resultados);
    }

    public static void obtenerInformacion(int num) {
        String mensaje = "";
        if (num > 0 && num <= 5) {
            mensaje = "Poca partitipacion en el club, hay que mejorar.";
        } else {
            if (num > 5 && num <= 16) {
                mensaje = "Buena participacion, sigan asi.";
            } else {
                if (num < 16) {
                    mensaje = "Excelente campaña del club.";
                } else {
                    if (num < 1) {
                        mensaje = "Mala campaña, debemos mejorar.";
                    }
                }
            }
        }
        System.out.printf("%s\n", mensaje);
    }
    
    public static void obtenerReporte(String [] areas, int[] participantes){
        String cadena = ("Las actividades ingresadas son:\n");
        for (int i = 0; i < areas.length; i++) {
            cadena = (cadena+(i + 1) + ". Número de Participantes de " + areas[i] + ": " + participantes[i]+"\n");
    }
        System.out.println(cadena);
    }
}
