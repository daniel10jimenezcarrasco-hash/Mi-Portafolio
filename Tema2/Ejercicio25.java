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

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número entero no negativo: ");
        
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            
            if (n < 0) {
                System.out.println("Error: El factorial no está definido para números negativos.");
            } else {
                long factorial = 1;
                
                for (int i = 1; i <= n; i++) {
                    factorial *= i;
                }
                
                System.out.println("El factorial de " + n + " es: " + factorial);
            }
        } else {
            System.out.println("Error: Debes introducir un número entero válido.");
        }
        
        scanner.close();
    }
}
    

