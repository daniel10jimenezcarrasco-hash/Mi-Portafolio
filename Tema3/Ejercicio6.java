/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;

/**
 *
 * @author 19_1DAW
 */
import java.util.Scanner;

public class Ejercicio6 {

    static Scanner teclado = new Scanner(System.in);

    // Método para leer una nota
    public static double leerNota() {
        System.out.print("Introduce una nota: ");
        return teclado.nextDouble();
    }

    // Método para calcular la media
    public static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    // Método para obtener la nota máxima
    public static double obtenerNotaMaxima(double nota1, double nota2, double nota3) {
        return Math.max(nota1, Math.max(nota2, nota3));
    }

    // Método para comprobar si está aprobado
    public static boolean estaAprobado(double media) {
        return media >= 5;
    }

    // Método para mostrar los resultados
    public static void mostrarResultados(double media, double maxima, boolean aprobado) {
        System.out.println("\n--- INFORME ACADEMICO ---");
        System.out.println("Nota media: " + media);
        System.out.println("Nota maxima: " + maxima);

        if (aprobado) {
            System.out.println("Resultado: APROBADO");
        } else {
            System.out.println("Resultado: SUSPENSO");
        }
    }

    // Método principal
    public static void main(String[] args) {

        double nota1 = leerNota();
        double nota2 = leerNota();
        double nota3 = leerNota();

        double media = calcularMedia(nota1, nota2, nota3);

        double maxima = obtenerNotaMaxima(nota1, nota2, nota3);

        boolean aprobado = estaAprobado(media);

        mostrarResultados(media, maxima, aprobado);

        teclado.close();
    }
}
