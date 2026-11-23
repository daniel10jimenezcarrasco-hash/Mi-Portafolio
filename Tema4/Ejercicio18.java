/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author 19_1DAW
 */
public class Ejercicio18 {

    public void incrementar(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]++;
        }
    }

    public void multiplicar(int[] numeros, int factor) {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numeros[i] * factor;
        }
    }

    public void rellenarCeros(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = 0;
        }
    }

    public int[] copiar(int[] numeros) {
        int[] copia = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            copia[i] = numeros[i];
        }
        return copia;
    }

    public static void main(String[] args) {
        Ejercicio18 obj = new Ejercicio18();

        int[] original = {2, 4, 6, 8};

        System.out.print("Array original inicial: ");
        mostrar(original);

        obj.incrementar(original);
        System.out.print("Tras incrementar (+1): ");
        mostrar(original);

        obj.multiplicar(original, 3);
        System.out.print("Tras multiplicar por 3: ");
        mostrar(original);

        obj.rellenarCeros(original);
        System.out.print("Tras rellenar con ceros: ");
        mostrar(original);


        int[] base = {10, 20, 30};
        int[] copia = obj.copiar(base);

        System.out.print("Array base: ");
        mostrar(base);
        System.out.print("Array copia: ");
        mostrar(copia);

        copia[0] = 999;
        System.out.println("Cambiamos el primer elemento de la copia a 999");

        System.out.print("Array base (debe seguir igual): ");
        mostrar(base);
        System.out.print("Array copia (modificado): ");
        mostrar(copia);
    }

    private static void mostrar(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

