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

public class Ejercicio27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        System.out.print("Introduce una palabra: ");
        String palabra = sc.nextLine();

        System.out.print("¿Ignorar mayúsculas y minúsculas? (s/n): ");
        String opcion = sc.nextLine().trim().toLowerCase();
        boolean ignorarMayusculas = opcion.equals("s") || opcion.equals("si") || opcion.equals("sí");

        String textoBase = frase;
        String objetivo = palabra;

        if (ignorarMayusculas) {
            textoBase = frase.toLowerCase();
            objetivo = palabra.toLowerCase();
        }

        boolean contiene = textoBase.contains(objetivo);
        int posicion = textoBase.indexOf(objetivo);
        boolean comienza = textoBase.startsWith(objetivo);
        boolean termina = textoBase.endsWith(objetivo);

        System.out.println();
        System.out.println("¿Contiene la palabra? " + contiene);
        System.out.println("Posición: " + posicion);
        System.out.println("¿Comienza por ella? " + comienza);
        System.out.println("¿Termina por ella? " + termina);

        sc.close();
    }
}
