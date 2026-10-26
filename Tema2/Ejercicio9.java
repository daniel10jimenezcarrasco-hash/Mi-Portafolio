/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion;

/**
 *
 * @author 19_1DAW
 */
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce la nota numérica (0 - 10): ");
        double nota = scanner.nextDouble();
        
        if (nota < 0 || nota > 10) {
            System.out.println("Error: La nota debe estar comprendida entre 0 y 10.");
        } else {
            int rango = (int) nota;
            
            switch (rango) {
                case 10:
                case 9:
                    System.out.println("Calificación: **Sobresaliente**");
                    break;
                case 8:
                case 7:
                    System.out.println("Calificación: **Notable**");
                    break;
                case 6:
                    System.out.println("Calificación: **Bien**");
                    break;
                case 5:
                    System.out.println("Calificación: **Suficiente**");
                    break;
                default:
                    System.out.println("Calificación: **Insuficiente**");
                    break;
            }
        }
        
        scanner.close();
    }
    
}
