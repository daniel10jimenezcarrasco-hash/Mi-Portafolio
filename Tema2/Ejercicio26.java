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

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        System.out.println("Introduzca dos números mayores que 0:");
        a = scanner.nextInt();
        b = scanner.nextInt();

        // Bucle para aplicar el algoritmo de Euclides mediante restas sucesivas
        while (b != 0) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        System.out.println("El Máximo Común Divisor es: " + a);
        
        scanner.close();
    }
}

//¿Qué hace el programa?
//Este programa calcula el Máximo Común Divisor (MCD) de dos números enteros positivos ingresados por el usuario, empleando el algoritmo de Euclides basado en restas sucesivas.   
//Comprueba si los números son distintos de cero y va restando el menor del mayor de forma repetida hasta que ambos valores se igualan, obteniendo así el MCD.
    

