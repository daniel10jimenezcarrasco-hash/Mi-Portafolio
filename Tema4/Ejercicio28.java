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

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        System.out.print("Posicion de inicio: ");
        int inicio = sc.nextInt();

        System.out.print("Posicion de fin: ");
        int fin = sc.nextInt();

        int longitud = frase.length();

        if (inicio < 0) {
            System.out.println("Error: la posicion de inicio no puede ser negativa.");
        } else if (fin > longitud) {
            System.out.println("Error: la posicion final supera la longitud de la frase (" + longitud + ").");
        } else if (inicio > fin) {
            System.out.println("Error: la posicion de inicio no puede ser mayor que la posicion final.");
        } else {
            String subcadena = frase.substring(inicio, fin);
            System.out.println("Subcadena extraida: \"" + subcadena + "\"");
        }

        String fraseSinEspacios = frase.trim();
        if (fraseSinEspacios.isEmpty()) {
            System.out.println("La frase esta vacia, no hay primera palabra.");
        } else {
            int espacio = fraseSinEspacios.indexOf(" ");
            String primeraPalabra;
            if (espacio == -1) {
                primeraPalabra = fraseSinEspacios;
            } else {
                primeraPalabra = fraseSinEspacios.substring(0, espacio);
            }
            System.out.println("Primera palabra: " + primeraPalabra);
        }

        sc.close();
    }
}
