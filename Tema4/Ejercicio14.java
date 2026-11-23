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

public class Ejercicio14 {
    public static void main(String[] args) {
        int[] numeros = {2, 5, 2, 8, 2, 9, 5, 2};

        int buscado = 2;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el numero a contar: ");
        buscado = teclado.nextInt();

        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                contador++;
            }
        }

        System.out.println("El numero " + buscado + " aparece " + contador + " veces.");

        teclado.close();
    }
}
