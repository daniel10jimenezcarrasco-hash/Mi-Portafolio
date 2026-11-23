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

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        String fraseMinusculas = frase.toLowerCase();

        int totalVocales = 0;
        int countA = 0;
        int countE = 0;
        int countI = 0;
        int countO = 0;
        int countU = 0;

        for (int i = 0; i < fraseMinusculas.length(); i++) {
            char caracter = fraseMinusculas.charAt(i);

            if (caracter == 'a') {
                countA++;
                totalVocales++;
            } else if (caracter == 'e') {
                countE++;
                totalVocales++;
            } else if (caracter == 'i') {
                countI++;
                totalVocales++;
            } else if (caracter == 'o') {
                countO++;
                totalVocales++;
            } else if (caracter == 'u') {
                countU++;
                totalVocales++;
            }
        }

        System.out.println("Número de vocales: " + totalVocales);
        System.out.println("Desglose por vocal:");
        System.out.println("a: " + countA);
        System.out.println("e: " + countE);
        System.out.println("i: " + countI);
        System.out.println("o: " + countO);
        System.out.println("u: " + countU);

        scanner.close();
    }
}
