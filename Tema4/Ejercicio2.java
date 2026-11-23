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

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double[] temperaturas = new double[5];

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Introduce la temperatura del día " + (i + 1) + ": ");
            temperaturas[i] = teclado.nextDouble();
        }

        System.out.println("Temperaturas almacenadas:");

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Día " + (i + 1) + ": " + temperaturas[i] + " °C");
        }

        System.out.println("Número de temperaturas almacenadas: " + temperaturas.length);

        teclado.close();
    }
}
