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

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número límite para contar: ");
        int limite = scanner.nextInt();
        
        int contador = 1;
        
        System.out.println("\n--- Contando del 1 al " + limite + " ---");
        
        do {
            System.out.println("Número: " + contador);
            contador++;
        } while (contador <= limite);
        
        scanner.close();
    }
    
}
