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

public class Ejercicio7 {

    static Scanner teclado = new Scanner(System.in);

    // Leer una nota
    public static double leerNota() {
        System.out.print("Introduce una nota: ");
        return teclado.nextDouble();
    }

    // Calcular la media
    public static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    // Obtener la nota máxima
    public static double obtenerNotaMaxima(double nota1, double nota2, double nota3) {
        return Math.max(nota1, Math.max(nota2, nota3));
    }

    // Comprobar si está aprobado
    public static boolean estaAprobado(double media) {
        return media >= 5;
    }

    // Calcular la potencia
    public static double calcularPotencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    // Calcular la raíz cuadrada
    public static double calcularRaiz(double numero) {
        return Math.sqrt(numero);
    }

    // Mostrar resultados
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

        // Operación de potencia
        System.out.print("\nIntroduce la base: ");
        double base = teclado.nextDouble();

        System.out.print("Introduce el exponente: ");
        double exponente = teclado.nextDouble();

        System.out.println("Potencia: " + calcularPotencia(base, exponente));

        // Operación de raíz cuadrada
        System.out.print("\nIntroduce un numero para calcular su raiz cuadrada: ");
        double numero = teclado.nextDouble();

        System.out.println("Raiz cuadrada: " + calcularRaiz(numero));

        teclado.close();
    }
}


