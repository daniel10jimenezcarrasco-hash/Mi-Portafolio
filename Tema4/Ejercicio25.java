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

public class Ejercicio25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un nombre de usuario: ");
        String usuario = sc.nextLine();

        boolean noVacio = !usuario.trim().isEmpty();
        boolean longitudMinima = usuario.length() >= 5;
        boolean longitudMaxima = usuario.length() <= 15;
        boolean sinEspacios = !usuario.contains(" ");

        System.out.println("Resultados de la comprobación");
        System.out.println("No está vacío: " + (noVacio ? "Sí" : "No"));
        System.out.println("Tiene al menos 5 caracteres: " + (longitudMinima ? "Sí" : "No"));
        System.out.println("No supera los 15 caracteres: " + (longitudMaxima ? "Sí" : "No"));
        System.out.println("No contiene espacios: " + (sinEspacios ? "Sí" : "No"));

        boolean valido = noVacio && longitudMinima && longitudMaxima && sinEspacios;
        if (valido) {
            System.out.println("Nombre de usuario válido.");
        } else {
            System.out.println("Nombre de usuario no válido.");
        }

        sc.close();
    }
}
