/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.politecnicomalaga.ejercicio5;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        
        System.out.println("Introduce tu nombre: ");
        String nombre = myScan.nextLine();
        System.out.println("Introduce tu direccion: ");
        String direccion = myScan.nextLine();
        System.out.println("Introduce tu telefono: ");
        String telefono = myScan.nextLine();
        
        System.out.printf("Tu nombre es: %s\nTu direccion es: %s\nTu telefono es: %s", nombre, direccion, telefono);
    }
}
