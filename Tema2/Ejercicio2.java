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

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1;
        int numero2;
        int suma;

        System.out.print("Introduce el primer número: ");
        numero1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        numero2 = scanner.nextInt();

        suma = numero1 + numero2;

        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);

        scanner.close();
    }
}
