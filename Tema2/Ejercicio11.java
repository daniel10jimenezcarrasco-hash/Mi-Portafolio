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

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Determinador de Triángulos ---");
        
        System.out.print("Ingrese el primer lado: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo lado: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer lado: ");
        double lado3 = scanner.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("\nLos lados SÍ forman un triángulo.");

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Tipo: Equilátero (todos los lados son iguales).");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Tipo: Isósceles (dos lados son iguales).");
            } else {
                System.out.println("Tipo: Escaleno (ningún lado es igual).");
            }
        } else {
            System.out.println("\nLos lados NO pueden formar un triángulo.");
            System.out.println("Razón: La suma de dos de los lados no es mayor que el tercero.");
        }

        scanner.close();
    }
    
}
