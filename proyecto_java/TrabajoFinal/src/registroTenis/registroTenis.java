/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registroTenis;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class registroTenis {
    public static void registrarParticipanteTenis(){
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String nivel;
        String ciudad;
        String manoHabil;
        System.out.println("Ingrese el nombre del pariticipante:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la edad del participante:");
        edad = entrada.nextInt();
        System.out.println("Ingrese el nivel del participante (principiante, intermedio, avanzado):");
        entrada.nextLine();
        nivel = entrada.nextLine();
        System.out.println("Ingrese la ciudad del participante:");
        ciudad = entrada.nextLine();
        System.out.println("ingrese la mano habil del participante (Derecha/Izquierda):");
        manoHabil = entrada.nextLine();
        System.out.printf("Datos\nNombre: %s\nEdad: %s\nNivel: %s\nCiudad: %s\n Mano Habil: %s\n",
                nombre, edad, nivel, ciudad, manoHabil);
    }
    
}
