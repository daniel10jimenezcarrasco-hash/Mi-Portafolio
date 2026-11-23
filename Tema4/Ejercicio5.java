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

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el tamaño del array: ");
        int tamano = scanner.nextInt();
        
        if (tamano <= 0) {
            System.out.println("El tamaño tiene que ser mayor que 0.");
            scanner.close();
            return;
        }
        
        int[] array = new int[tamano];
        
        System.out.println("\nIntroduce los " + tamano + " elementos:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Elemento [" + i + "]: ");
            array[i] = scanner.nextInt();
        }
        
        System.out.print("\n¿Qué posición quieres consultar? (0 a " + (tamano - 1) + "): ");
        int posicion = scanner.nextInt();
        
        if (posicion >= 0 && posicion < array.length) {
            System.out.println("El valor en la posición " + posicion + " es: " + array[posicion]);
        } else {
            System.out.println("Error: La posición " + posicion + " no es válida. Debe estar entre 0 y " + (tamano - 1) + ".");
        }
        
        scanner.close();
    }
}
