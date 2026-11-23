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

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        double[] precios = new double[5];

        
        System.out.println("=== INGRESO DE PRECIOS ===");
        for (int i = 0; i < precios.length; i++) {
            System.out.print("Introduce el precio del producto " + (i + 1) + ": ");
            precios[i] = scanner.nextDouble();
        }

        
        System.out.println("\n=== LISTADO DE PRECIOS ===");
        mostrarPrecios(precios);

        
        int posicion;
        while (true) {
            System.out.print("\nIntroduce la posición del producto a modificar (1 a " + precios.length + "): ");
            posicion = scanner.nextInt();

            
            if (posicion >= 1 && posicion <= precios.length) {
                break; 
            } else {
                System.out.println("Error: Posición no válida. Debe estar entre 1 y " + precios.length + ".");
            }
        }

        System.out.print("Introduce el nuevo precio para el producto " + posicion + ": ");
        double nuevoPrecio = scanner.nextDouble();
        
        
        precios[posicion - 1] = nuevoPrecio;

        
        System.out.println("\n=== LISTADO DE PRECIOS ACTUALIZADO ===");
        mostrarPrecios(precios);

        scanner.close();
    }

    public static void mostrarPrecios(double[] arrayPrecios) {
        for (int i = 0; i < arrayPrecios.length; i++) {
            System.out.printf("Producto %d: %.2f €%n", (i + 1), arrayPrecios[i]);
        }
    }
}

