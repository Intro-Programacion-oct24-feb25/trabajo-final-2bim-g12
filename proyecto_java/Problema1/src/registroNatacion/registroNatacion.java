/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registroNatacion;
import java.util.Scanner;



/**
 *
 * @author ASUS
 */
public class registroNatacion {
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
    
}
