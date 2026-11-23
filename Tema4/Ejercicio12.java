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

public class Ejercicio12 {
    public static void main(String[] args) {
        int[] numeros = {12, 5, 8, 21, 4, 16, 9};

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el numero a buscar: ");
        int buscado = teclado.nextInt(); 

        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El numero " + buscado + " esta presente en el array.");
        } else {
            System.out.println("El numero " + buscado + " no esta presente en el array.");
        }

        teclado.close();
    }
}
