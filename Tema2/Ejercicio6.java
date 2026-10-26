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

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es **PAR**.");
        } else {
            System.out.println("El número " + numero + " es **IMPAR**.");
        }
        
        scanner.close();
    }
    
}
