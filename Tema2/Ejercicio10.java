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

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== CALCULADORA BÁSICA ===");
        System.out.println("1. Suma (+)");
        System.out.println("2. Resta (-)");
        System.out.println("3. Multiplicación (*)");
        System.out.println("4. División (/)");
        System.out.print("Elige una opción (1-4): ");
        
        int opcion = scanner.nextInt();
        
        if (opcion < 1 || opcion > 4) {
            System.out.println("Error: La opción seleccionada no es válida.");
            scanner.close();
            return;
        }
        
        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();
        
        double resultado = 0;
        
        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                System.out.printf("Resultado: %.2f + %.2f = %.2f\n", num1, num2, resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.printf("Resultado: %.2f - %.2f = %.2f\n", num1, num2, resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.printf("Resultado: %.2f * %.2f = %.2f\n", num1, num2, resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.printf("Resultado: %.2f / %.2f = %.2f\n", num1, num2, resultado);
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
        }
        
        scanner.close();
    }
    
}
