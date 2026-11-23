/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author 19_1DAW
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        double[] precios = {10.0, 15.5, 20.0, 8.5, 12.0};

        System.out.println("--- Precios originales ---");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Producto " + (i + 1) + ": " + precios[i] + " €");
        }
        System.out.println();

        for (int i = 0; i < precios.length; i++) {
            precios[i] = precios[i] * 1.05;
        }

        System.out.println("--- Precios actualizados (+5%) ---");
        for (int i = 0; i < precios.length; i++) {
            System.out.printf("Producto %d: %.2f €%n", (i + 1), precios[i]);
        }
        System.out.println();

        double suma = 0;
        for (double p : precios) {
            suma += p;
        }
        double media = suma / precios.length;
        System.out.printf("Precio medio: %.2f €%n", media);

        int contador = 0;
        for (double p : precios) {
            if (p > 15.0) {
                contador++;
            }
        }
        System.out.println("Productos con un precio superior a 15 €: " + contador);
    }
}
