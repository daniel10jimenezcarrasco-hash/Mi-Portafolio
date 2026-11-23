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

public class Ejercicio26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = sc.nextLine().trim();

        System.out.print("Primer apellido: ");
        String apellido1 = sc.nextLine().trim();

        System.out.print("Segundo apellido: ");
        String apellido2 = sc.nextLine().trim();

        String iniciales = obtenerIniciales(nombre, apellido1, apellido2);

        System.out.println("Iniciales: " + iniciales);

        sc.close();
    }

    public static String obtenerIniciales(String nombre, String apellido1, String apellido2) {
        char i1 = caracterInicialMayuscula(nombre);
        char i2 = caracterInicialMayuscula(apellido1);
        char i3 = caracterInicialMayuscula(apellido2);

        return "" + i1 + i2 + i3;
    }

    private static char caracterInicialMayuscula(String texto) {
        if (texto == null || texto.isEmpty()) {
            return '?';
        }
        return Character.toUpperCase(texto.charAt(0));
    }
}
