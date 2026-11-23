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

public class Ejercicio13 {
    public static void main(String[] args) {
        int[] numeros = {12, 5, 8, 21, 4, 16, 9};

        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero buscado: ");
        int buscado = teclado.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                System.out.println("El numero se encuentra en la posición " + i + ".");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("El numero " + buscado + " no existe en la array.");
        }

        teclado.close();
    }
}
