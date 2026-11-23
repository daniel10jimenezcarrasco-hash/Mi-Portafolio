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

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un texto: ");
        String texto = scanner.nextLine();

        int letras = 0;
        int mayusculas = 0;
        int minusculas = 0;
        int digitos = 0;
        int espacios = 0;
        int otros = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (Character.isLetter(c)) {
                letras++;
                if (Character.isUpperCase(c)) {
                    mayusculas++;
                } else if (Character.isLowerCase(c)) {
                    minusculas++;
                }
            } else if (Character.isDigit(c)) {
                digitos++;
            } else if (Character.isWhitespace(c)) {
                espacios++;
            } else {
                otros++;
            }
        }

        System.out.println("Letras: " + letras);
        System.out.println("  - Mayúsculas: " + mayusculas);
        System.out.println("  - Minúsculas: " + minusculas);
        System.out.println("Dígitos: " + digitos);
        System.out.println("Espacios: " + espacios);
        System.out.println("Otros caracteres: " + otros);

        scanner.close();
    }
}
