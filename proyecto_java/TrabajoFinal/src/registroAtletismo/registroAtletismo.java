/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registroAtletismo;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class registroAtletismo {
    public static String registrarParticipanteAtletismo() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String especialidad;
        String ciudad;
        double record;
        String cadena;
        
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
        
        cadena = String.format("Datos\nNombre: %s\nEdad: %d\nEspecialidad: %s\nCiudad: %s\n Record %.2f\n",
                nombre, edad, especialidad, ciudad, record);
        
        return cadena;

    }
}
