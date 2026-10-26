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

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce varios números separados por espacios (luego presiona Enter):");
        String entrada = scanner.nextLine();
        String[] partes = entrada.trim().split("\\s+");
        
        double suma = 0;
        int contador = 0;
        
        for (String parte : partes) {
            try {
                double numero = Double.parseDouble(parte);
                suma += numero;
                contador++;
            } catch (NumberFormatException e) {
                System.out.println("Aviso: '" + parte + "' no es un número válido y será ignorado.");
            }
        }
        
        if (contador > 0) {
            double promedio = suma / contador;
            System.out.println("\n--- Resultados ---");
            System.out.println("Cantidad de números válidos: " + contador);
            System.out.printf("El promedio es: %.2f\n", promedio);
        } else {
            System.out.println("No se introdujo ningún número válido.");
        }
        
        scanner.close();
    }
}
    
