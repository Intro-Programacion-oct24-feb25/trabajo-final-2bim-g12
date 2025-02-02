/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registroCiclismo;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class registroCiclismo {
    public static void registrarParticipanteCiclismo() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String tipoCiclismo;
        String ciudad;
        String marca;
        System.out.println("Ingrese el nombre del participante:");
        nombre= entrada.nextLine();
        System.out.println("Ingrese la edad del participante:");
        edad = entrada.nextInt();
        System.out.println("Ingrese el tipo de ciclismo que practica el participante:");
        entrada.nextLine();
        tipoCiclismo = entrada.nextLine();
        System.out.println("Ingrese  la ciudad del participante:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese la marca de bicicletas favorita del participante:");
        marca=entrada.nextLine();
        System.out.printf("Datos\nNombre: %s\nEdad: %s\nTipo de Ciclismo: %s\nMarca: %s\n Ciudad %s\n",
                nombre, edad, tipoCiclismo, marca, ciudad);
        

    }
    
}
