/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author 19_1DAW
 */
public class Ejercicio17 {

    public static void mostrar(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }

    public static int sumar(int[] arr) {
        int s = 0;
        for (int n : arr) {
            s += n;
        }
        return s;
    }

    public static double calcularMedia(int[] arr) {
        if (arr.length == 0) return 0;
        return (double) sumar(arr) / arr.length;
    }

    public static int obtenerMaximo(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int contarPares(int[] arr) {
        int contador = 0;
        for (int n : arr) {
            if (n % 2 == 0) contador++;
        }
        return contador;
    }

    // Ampliación: primera aparición o -1
    public static int buscar(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4, 7, 2, 9, 12, 7, 5};

        System.out.print("Array: ");
        mostrar(nums);

        System.out.println("Suma: " + sumar(nums));
        System.out.println("Media: " + calcularMedia(nums));
        System.out.println("Máximo: " + obtenerMaximo(nums));
        System.out.println("Pares: " + contarPares(nums));

        // Probando la ampliación
        System.out.println("Posición del 9: " + buscar(nums, 9));
        System.out.println("Posición del 99: " + buscar(nums, 99));
    }
}

