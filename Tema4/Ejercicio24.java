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

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primera palabra: ");
        String palabra1 = scanner.next();

        System.out.print("Segunda palabra: ");
        String palabra2 = scanner.next();

        boolean sonIguales = palabra1.equals(palabra2);

        boolean igualesIgnorandoMayus = palabra1.equalsIgnoreCase(palabra2);

        boolean mismaLongitud = palabra1.length() == palabra2.length();

        boolean mismoPrimerCaracter = false;
        if (palabra1.length() > 0 & palabra2.length() > 0) {
            mismoPrimerCaracter = palabra1.charAt(0) == palabra2.charAt(0);
        }

        System.out.println("¿Son iguales? " + sonIguales);
        System.out.println("¿Son iguales ignorando mayusculas? " + igualesIgnorandoMayus);
        System.out.println("¿Tienen la misma longitud? " + mismaLongitud);
        System.out.println("¿Empiezan por el mismo caracter? " + mismoPrimerCaracter);

        scanner.close();
    }
}
