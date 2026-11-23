/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author 19_1DAW
 */
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperaturas = new double[7];
        
        System.out.println("Introduce la temperatura de los 7 dias:");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Dia " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
        }
        
        System.out.println("Temperaturas registradas");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Día " + (i + 1) + ": " + temperaturas[i] + " °C");
        }
        
     
        double suma = 0;
        double max = temperaturas[0];
        double min = temperaturas[0];
        int diasMayores25 = 0;
        
        
        for (int i = 0; i < temperaturas.length; i++) {
            double tempActual = temperaturas[i];
            
            suma += tempActual;
            
            if (tempActual > max) {
                max = tempActual;
            }
            
            if (tempActual < min) {
                min = tempActual;
            }
            
            if (tempActual > 25) {
                diasMayores25++;
            }
        }
        
        double media = suma / temperaturas.length;
        
        System.out.println("Estadisticas");
        System.out.println("Temperatura media: " + media + " °C");
        System.out.println("Temperatura maxima: " + max + " °C");
        System.out.println("Temperatura minima: " + min + " °C");
        System.out.println("Dias que superaron los 25 °C: " + diasMayores25);
        
        scanner.close();
    }
}
