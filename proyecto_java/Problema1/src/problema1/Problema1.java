/*
 * To change this license hea+der, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package problema1;

import java.util.Scanner;

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
        boolean bandera = true;
        while (bandera) {
            System.out.println("Ingrese la opcion a la que desea aplicar: ");
            for (int i = 0; i < areas.length; i++) {
                System.out.println((i + 1) + "." + "Para " + areas[i] + " ingrese: " + "(" + (i + 1) + ")");
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
                case (4):
                    registrarParticipanteBasquetbol();
                    resultados[3] = resultados[3] + 1;
                    break;
                case (5):
                    registrarParticipanteCiclismo();
                    resultados[4] = resultados[4] + 1;
                    break;
                /*case (6):
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
        System.out.println("Ingrese el estilo del participante:");
        estilo = entrada.nextLine();
        System.out.printf("Datos\nNombre: %s\nEdad: %d\nNivel: %s\nCiudad: %s\n: Estilo %s\n", nombre,
                edad, nivel, ciudad, estilo);

    }

    public static void registrarParticipanteAtletismo() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String especialidad;
        String ciudad;
        double record;
        System.out.println("Ingrese el nombre del participante:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la edad del participante:");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese la especialidad del pariticpante(carreras, salto, lanzamiento):");
        especialidad = entrada.nextLine();
        System.out.println("Ingrese la ciudad del participante:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el record del participante:");
        record = entrada.nextDouble();
        System.out.printf("Datos\nNombre: %s\nEdad: %d\nEspecialidad: %s\nCiudad: %s\n Record %.2f\n",
                nombre, edad, especialidad, ciudad, record);

    }

    public static void registrarParticipanteBasquetbol() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String posicion;
        double estatura;
        String ciudad;
        System.out.println("Ingrese el nombre del participante:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la edad del participante:");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese la posicion del participante:");
        posicion = entrada.nextLine();
        System.out.println("Ingrese la estatura del participante:");
        estatura = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Ingrese la ciudad del participante:");
        ciudad = entrada.nextLine();
        System.out.printf("Datos\nNombre: %s\nEdad: %d\nPosicion: %s\nEstatura: %.2f\n Ciudad %s\n",
                nombre, edad, posicion, estatura, ciudad);
    }

    public static void registrarParticipanteCiclismo() {
        Scanner entrada = new Scanner(System.in);
        

    }
}
