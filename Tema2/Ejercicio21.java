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

public class Ejercicio21 {
    public static void mostrarTabla(int numero) {
        System.out.println("--- Tabla de multiplicar del " + numero + " ---");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }

    public static void main(String[] args) {
        int numeroFijo = 5;
        mostrarTabla(numeroFijo);


        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número para ver su tabla de multiplicar: ");
        int numeroIngresado = scanner.nextInt();
        
        mostrarTabla(numeroIngresado);
        
        scanner.close();
    }
}
