/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author 19_1DAW
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        int[] numeros = {12, 5, 8, 20, 3, 15};

        System.out.println("1. Todos los números");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento en índice " + i + ": " + numeros[i]);
        }

        System.out.println("2. Todos los numeros");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        System.out.println("3. Numeros mayores que 10");
        for (int numero : numeros) {
            if (numero > 10) {
                System.out.println(numero);
            }
        }
    }
}
