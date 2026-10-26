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

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n--- CAJERO AUTOMÁTICO ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            
            int opcion = scanner.nextInt();
            
            if (opcion == 1) {
                System.out.println("Mostrando saldo...");
            } else if (opcion == 2) {
                System.out.println("Retirando dinero...");
            } else if (opcion == 3) {
                System.out.println("Gracias por usar el cajero. ¡Adiós!");
                break;
            } else {
                System.out.println("Opción no válida. Por favor, introduce 1, 2 o 3.");
            }
        }
        
        scanner.close();
    }
    
}
