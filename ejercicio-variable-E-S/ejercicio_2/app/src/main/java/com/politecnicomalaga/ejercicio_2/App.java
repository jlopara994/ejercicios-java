/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.politecnicomalaga.variables_ejercicio2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        System.out.print("Introduce X: ");
        int x = myScanner.nextInt();
        System.out.print("Introduce Y: ");
        int y = myScanner.nextInt();
        System.out.println(x);
        System.out.println(y);
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
    }
}
