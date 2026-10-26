/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion;

/**
 *
 * @author 19_1DAW
 */
import java.util.Scanner;

public class Ejercicio3 {
    private static final int PIN_CORRECTO = 1234;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre de usuario: ");
        String usuario = scanner.nextLine();

        System.out.print("Introduce tu PIN: ");
        int pinIngresado = scanner.nextInt();

        if (pinIngresado == PIN_CORRECTO) {
            System.out.println("¡Bienvenido " + usuario + "!");
        }

        System.out.println("Fin");

        scanner.close();
    }
}
