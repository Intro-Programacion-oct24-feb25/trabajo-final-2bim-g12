/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registroFutbol;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class registroFutbol {
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
    
}
