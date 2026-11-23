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

public class Ejercicio22 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        String palabra = teclado.next();

        int longitud = palabra.length();
        char primero = palabra.charAt(0);
        char ultimo = palabra.charAt(longitud - 1);

        System.out.println("Palabra: " + palabra);
        System.out.println("Longitud: " + longitud); 
        System.out.println("Primer caracter: " + primero); 
        System.out.println("Ultimo carácter: " + ultimo); 

        if (longitud > 10) {
            System.out.println("La palabra tiene mas de 10 caracteres.");
        } else {
            System.out.println("La palabra no tiene mas de 10 caracteres.");
        }

        teclado.close();
    }
}
