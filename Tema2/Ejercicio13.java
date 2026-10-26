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

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número entero positivo: ");
        int numero = scanner.nextInt();
        
        if (numero <= 0) {
            System.out.println("El número debe ser un entero positivo.");
        } else {
            System.out.print("Resultado: ");
            for (int i = 1; i <= numero; i++) {
                System.out.print(i);
                
                if (i < numero) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        
        scanner.close();
    }
    
}
