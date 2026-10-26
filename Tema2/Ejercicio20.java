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

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int numero;

        System.out.println("--- Algoritmo Acumulador ---");
        System.out.print("Introduce un número (0 para terminar): ");
        numero = scanner.nextInt();

        while (numero != 0) {
            suma += numero;
            System.out.println("Suma parcial actual: " + suma);
            
            System.out.print("Introduce otro número (0 para terminar): ");
            numero = scanner.nextInt();
        }

        System.out.println("\n¡Programa finalizado!");
        System.out.println("La suma total acumulada es: " + suma);
        
        scanner.close();
    }
    
}
