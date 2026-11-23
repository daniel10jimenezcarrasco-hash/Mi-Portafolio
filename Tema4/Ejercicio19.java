/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author 19_1DAW
 */
public class Ejercicio19 {

    public static final double NOTA_APROBADO = 5.0;

    public static void main(String[] args) {
        double[] notas = {4.5, 7.0, 8.5, 3.0, 6.5, 9.0};

        System.out.println("--- Listado de notas ---");
        mostrarNotas(notas);

        double media = calcularMedia(notas);
        System.out.printf("%nMedia: %.2f%n", media);

        int aprobados = contarAprobados(notas);
        System.out.println("Número de aprobados: " + aprobados);

        double maxima = obtenerMaxima(notas);
        System.out.println("Nota máxima: " + maxima);

        double objetivo = 8.5;
        int posicion = buscarNota(notas, objetivo);
        if (posicion != -1) {
            System.out.println("La nota " + objetivo + " está en la posición " + posicion);
        } else {
            System.out.println("La nota " + objetivo + " no aparece en el array.");
        }

        double[] notasAprobadas = obtenerAprobados(notas);
        System.out.println("--- Notas aprobadas ---");
        mostrarNotas(notasAprobadas);
    }

    public static void mostrarNotas(double[] notas) {
        if (notas == null || notas.length == 0) {
            System.out.println("No hay notas para mostrar.");
            return;
        }
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i]);
            if (i < notas.length - 1) {
                System.out.print(" - ");
            }
        }
        System.out.println();
    }

    public static double calcularMedia(double[] notas) {
        if (notas == null || notas.length == 0) {
            return 0.0;
        }
        double suma = 0.0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    public static int contarAprobados(double[] notas) {
        if (notas == null) {
            return 0;
        }
        int contador = 0;
        for (double nota : notas) {
            if (nota >= NOTA_APROBADO) {
                contador++;
            }
        }
        return contador;
    }

    public static double obtenerMaxima(double[] notas) {
        if (notas == null || notas.length == 0) {
            throw new IllegalArgumentException("El array de notas no puede estar vacío.");
        }
        double max = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > max) {
                max = notas[i];
            }
        }
        return max;
    }

    public static int buscarNota(double[] notas, double buscada) {
        if (notas == null) {
            return -1;
        }
        for (int i = 0; i < notas.length; i++) {
            if (Double.compare(notas[i], buscada) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static double[] obtenerAprobados(double[] notas) {
        int totalAprobados = contarAprobados(notas);
        double[] resultado = new double[totalAprobados];

        int indice = 0;
        for (double nota : notas) {
            if (nota >= NOTA_APROBADO) {
                resultado[indice] = nota;
                indice++;
            }
        }
        return resultado;
    }
}
