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
    public static String cadenaGlobal = "Reporte del Club 'El deporte para la vida'\n";

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] areas = {"Futbol", "Natacion", "Atletismo", "Basquetbol", "Ciclismo", "Tenis", "Yoga"};
        int[] resultados = new int[7];
        int opcion;
        int numeroCuentas = 0;
        boolean bandera = true;
        while (bandera) {
            System.out.println("\nIngrese la opcion a la que desea aplicar: ");
            for (int i = 0; i < areas.length; i++) {
                System.out.println((i + 1) + "." + "Para " + areas[i] + " ingrese: " + "(" + (i + 1) + ")");
            }
            opcion = entrada.nextInt();
            switch (opcion) {
                case (1):
                    cadenaGlobal = String.format("%s%s", cadenaGlobal, registroFutbol.registrarParticipanteFutbol());
                    resultados[0]++;
                    break;
                case (2):
                    cadenaGlobal = String.format("%s%s", cadenaGlobal, registroNatacion.registrarParticipanteNatacion());
                    resultados[1] ++;
                    break;
                case (3):
                    cadenaGlobal = String.format("%s%s", cadenaGlobal,registroAtletismo.registrarParticipanteAtletismo());
                    resultados[2]++;
                    break;
                case (4):
                    cadenaGlobal = String.format ("%s%s", cadenaGlobal, registroBasquetbol.registrarParticipanteBasquetbol());
                    resultados[3] ++;
                    break;
                case (5):
                    cadenaGlobal = String.format("%s%s", cadenaGlobal,registroCiclismo.registrarParticipanteCiclismo());
                    resultados[4] ++;
                    break;
                case (6):
                    cadenaGlobal = String.format("%s%s", cadenaGlobal, registroTenis.registrarParticipanteTenis());
                    resultados[5] ++;
                    break;
                case (7):
                    cadenaGlobal = String.format("%s%s", cadenaGlobal,registroYoga.registrarParticipanteYoga());
                    resultados[6] ++;
                    break;
                default:
                    System.out.println("Lo sentimos, el club no tiene esa opción");
                    bandera = false;
            }
            numeroCuentas += 1;
            System.out.println("¿Desea continuar? Seleccione: Si/No");
            entrada.nextLine();
            String continua = entrada.nextLine().toUpperCase();
            switch (continua) {
                case ("NO"):
                    bandera = false;
                    break;
            }

        } 

        String informacion = obtenerInformacion(numeroCuentas);
        String reporte = obtenerReporte(areas, resultados);
        System.out.printf("%s\n%s\n%s\n", cadenaGlobal, informacion, reporte);
    }

    public static String obtenerInformacion(int num) {
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
        return mensaje;
    }
     public static String obtenerReporte(String[] areas, int[] participantes) {
        String cadena = ("Las actividades ingresadas son:\n");
        for (int i = 0; i < areas.length; i++) {
            cadena = (cadena + (i + 1) + ". Número de Participantes de " + areas[i] + ": " + participantes[i] + "\n");
        }
        return cadena;
    }
    
    
}

