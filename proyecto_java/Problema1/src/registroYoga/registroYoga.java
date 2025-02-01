/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registroYoga;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class registroYoga {
    public static void registrarParticipanteYoga(){
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String nivel;
        String ciudad;
        String estiloYoga;
        System.out.println("Ingrese el nombre del participante:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la edad del participante:");
        edad = entrada.nextInt();
        System.out.println("Ingrese el nivel del participante (principante, intermedio, avanzado):");
        entrada.nextLine();
        nivel = entrada.nextLine();
        System.out.println("Ingrese la ciudad del participante:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el estilo de yoga favorito del participante:");
        estiloYoga = entrada.nextLine();
        System.out.printf("Datos\nNombre: %s\nEdad: %s\nNivel: %s\nCiudad: %s\n Mano Habil: %s\n",
                nombre, edad, nivel, ciudad, estiloYoga);
        
        
    }
    
}
