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

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el número hasta el que quieres contar: ");
        int limite = scanner.nextInt();
        
        System.out.println("\n--- Contando del 1 al " + limite + " ---");
        
        for (int i = 1; i <= limite; i++) {
            System.out.println(i);
        }
        
        scanner.close();
    }
    
}
