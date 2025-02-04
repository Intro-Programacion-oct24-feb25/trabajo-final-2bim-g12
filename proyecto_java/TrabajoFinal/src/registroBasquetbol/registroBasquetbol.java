/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registroBasquetbol;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class registroBasquetbol {
    public static String registrarParticipanteBasquetbol() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String posicion;
        double estatura;
        String ciudad;
        String cadena;
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
        cadena = String.format("Datos\nNombre: %s\nEdad: %d\nPosicion: %s\nEstatura: %.2f\n Ciudad %s\n",
                nombre, edad, posicion, estatura, ciudad);
        return cadena;
    }
    
}
