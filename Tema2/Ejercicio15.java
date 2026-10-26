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

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el número hasta el que quieres contar: ");
        int limite = scanner.nextInt();
        
        int contador = 1;
        
        System.out.println("\n--- Iniciando conteo ---");
        
        do {
            System.out.println("Número: " + contador);
            contador++;
        } while (contador <= limite);
        
        System.out.println("--- Conteo finalizado ---");
        
        scanner.close();
    }
    
}
