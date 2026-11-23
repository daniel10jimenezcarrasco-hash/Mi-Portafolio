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

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Texto: ");
        String texto = scanner.nextLine();

        System.out.print("Carácter: ");
        String entradaCaracter = scanner.nextLine();

        if (entradaCaracter.isEmpty()) {
            System.out.println("No has introducido ningún carácter.");
            scanner.close();
            return;
        }

        char objetivo = entradaCaracter.charAt(0);

        int apariciones = 0;
        int primeraPosicion = -1;
        int ultimaPosicion = -1;
        StringBuilder posiciones = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == objetivo) {
                apariciones++;

                if (primeraPosicion == -1) {
                    primeraPosicion = i;
                }
                ultimaPosicion = i;

                if (posiciones.length() > 0) {
                    posiciones.append(", ");
                }
                posiciones.append(i);
            }
        }

        boolean aparece = apariciones > 0;

        System.out.println("Aparece: " + aparece);
        System.out.println("Número de apariciones: " + apariciones);
        System.out.println("Primera posición: " + primeraPosicion);
        System.out.println("Última posición: " + ultimaPosicion);

        if (aparece) {
            System.out.println("Posiciones: " + posiciones.toString());
        } else {
            System.out.println("Posiciones: ninguna");
        }

        scanner.close();
    }
}
