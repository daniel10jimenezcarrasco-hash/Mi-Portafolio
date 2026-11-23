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

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre completo: ");
        String entrada = scanner.nextLine();

        String limpio = entrada.trim();

        String mayusculas = limpio.toUpperCase();

        String minusculas = limpio.toLowerCase();

        String conGuiones = limpio.replaceAll("\\s+", "-");

        System.out.println("Resultado:");
        System.out.println(mayusculas);
        System.out.println(minusculas);
        System.out.println(conGuiones);

        scanner.close();
    }
}
