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

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[10];
        
        int suspensos = 0;
        int aprobados = 0;
        int notables = 0;
        int sobresalientes = 0;

        System.out.println("CLASIFICACIÓN DE NOTAS");
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce la nota del alumno " + (i + 1) + ": ");
            double nota = sc.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("-> Nota inválida. Debe estar entre 0 y 10. Repite.");
                i--;
                continue;
            }

            notas[i] = nota;

            if (nota < 5) {
                suspensos++;
            } else if (nota < 7) {
                aprobados++;
            } else if (nota < 9) {
                notables++;
            } else {
                sobresalientes++;
            }
        }

        sc.close();
        
        int sumaCategorias = suspensos + aprobados + notables + sobresalientes;

        int totalAprobados = aprobados + notables + sobresalientes;
        double porcentajeAprobados = (totalAprobados * 100.0) / 10.0;

        System.out.println("RESULTADOS");
        System.out.println("Suspensos (< 5): " + suspensos);
        System.out.println("Aprobados [5 - 7): " + aprobados);
        System.out.println("Notables [7 - 9): " + notables);
        System.out.println("Sobresalientes (>= 9): " + sobresalientes);
        System.out.println("----------------------------------------");
        System.out.println("Suma de todas las categorías: " + sumaCategorias);
        System.out.println("Porcentaje de aprobados: " + porcentajeAprobados + "%");
    }
}
