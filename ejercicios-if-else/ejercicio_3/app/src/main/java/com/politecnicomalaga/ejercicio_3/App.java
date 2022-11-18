/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.politecnicomalaga.ejercicio_3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*  
        Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que las
        horas ordinarias (40 primeras horas de trabajo) se pagan a 15 euros la hora. A partir de la hora 41, se
        pagan a 20 euros la hora. Lee el número de horas trabajadas una semana por un trabajador y calcula
        su retribución.
        */
        
        Scanner myScanner = new Scanner(System.in);
        int horasOrdinarias = 40;
        int pagoOrdinario = 15;
        int pagoExtra = 20;
        
        System.out.print("Horas Trabajadas: ");
        int horasTrabajadas = myScanner.nextInt();
        
        if(horasTrabajadas <= horasOrdinarias) {
            System.out.println(horasTrabajadas * pagoOrdinario);
        } else {
            System.out.println((horasTrabajadas - horasOrdinarias) * pagoExtra + horasOrdinarias * pagoOrdinario);
        }
    }
}
