/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author 19_1DAW
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        int[][] numeros = {
            {2, 4, 6, 8},
            {1, 3, 5, 7},
            {10, 20, 30, 40}
        };

        System.out.println("Matriz:");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("Dimensiones:");
        System.out.println("Filas: " + numeros.length);
        System.out.println("Columnas: " + numeros[0].length);

        System.out.println("Elemento 2ª fila, 3ª columna: " + numeros[1][2]);

        numeros[0][0] = 99;
        System.out.println("Modificamos la 1ª fila y 1ª columna a 99.");
        System.out.println("Nuevo valor en [0][0]: " + numeros[0][0]);

        int sumaTotal = 0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                sumaTotal += numeros[i][j];
            }
        }
        System.out.println("Suma total de todos los elementos: " + sumaTotal);

        System.out.println("Ampliación: Suma por filas ---");
        for (int i = 0; i < numeros.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < numeros[i].length; j++) {
                sumaFila += numeros[i][j];
            }
            System.out.println("Suma de la fila " + (i + 1) + ": " + sumaFila);
        }
    }
}

