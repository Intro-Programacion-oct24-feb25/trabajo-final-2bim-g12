
package problema1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] areas = {"Futbol", "Natacion", "Atletismo", "Basquetbol", "Ciclismo", "Tenis", "Yoga"};
        int[] resultados = new int[7];
        int opcion;
        boolean bandera = true;
        while (bandera) {
            System.out.println("Ingrese la opcion a la que desea aplicar: ");
            for (int i = 0; i < areas.length; i++) {
                System.out.println((i + 1) + "." + areas[i] + "(" + (i + 1) + ")");
            }
            opcion = entrada.nextInt();
            switch (opcion) {
                case (1):
                    registrarParticipanteFutbol();
                    resultados[0] = resultados[0] + 1;
                    break;
                case (2):
                    registrarParticipanteNatacion();
                    resultados[1] = resultados[1] + 1;
                    break;
                case (3):
                    registrarParticipanteAtletismo();
                    resultados[2] = resultados[2] + 1;
                    break;
                /* case (4):
                    registrarParticipanteBasquetbol();
                    resultados[3] = resultados[3] + 1;
                    break;
                case (5):
                    registrarParticipanteCiclismo();
                    resultados[4] = resultados[4] + 1;
                    break;
                case (6):
                    registrarParticipanteTenis();
                    resultados[5]=resultados[5]+1;
                    break;
                case (7):
                    registrarParticipanteNYoga();
                    resultados[6]=resultados[6]+1;
                    break; */
                default:
                    System.out.println("Lo sentimos, el club no tiene esa opción");
                    bandera = false;
            }
            System.out.println("¿Desea continuar? Seleccione: Si/No");
            entrada.nextLine();
            String continua = entrada.nextLine();
            switch (continua) {
                case ("No"):
                    bandera = false;
                    break;
            }

        }
    }

    public static void registrarParticipanteFutbol() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String posicion;
        String ciudad;
        String equipo;
        System.out.println("Ingrese el nombre del participante:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la edad del participante:");
        edad = entrada.nextInt();
        System.out.println("Ingrese la posicion del participante:");
        entrada.nextLine();
        posicion = entrada.nextLine();
        System.out.println("Ingrese la ciudad del participante:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el equipo favorito del participante:");
        equipo = entrada.nextLine();
        System.out.printf("Datos\nNombre: %s\nEdad: %d\nPosicion: %s\nCiudad: %s\nEquipo: %s\n", nombre,
                edad, posicion, ciudad, equipo);

    }

    public static void registrarParticipanteNatacion() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String nivel;
        String ciudad;
        String estilo;
        System.out.println("Ingrese el nombre del participante:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la edad del participante:");
        edad = entrada.nextInt();
        System.out.println("Ingrese el nivel del participante(Principiante, Intermedio, Avanzado):");
        entrada.nextLine();
        nivel = entrada.nextLine();
        System.out.println("Ingrese la ciudad del participante:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el estilo favorito del participante:");
        estilo = entrada.nextLine();
        System.out.printf("Datos\nNombre: %s\nEdad: %d\nNivel: %s\nCiudad: %s\n: %s\n", nombre,
                edad, nivel, ciudad, estilo);

    }

    public static void registrarParticipanteAtletismo() {

    }
}
