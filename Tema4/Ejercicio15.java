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

public class Ejercicio15 {
    public static void main(String[] args) {
        int[] notas = {4, 7, 3, 8, 5, 2, 9, 6, 4, 7};

        int aprobados = 0;
        boolean existeDiez = false;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                aprobados++;
            }
            if (notas[i] == 10) {
                existeDiez = true;
            }
        }

        int suspensos = notas.length - aprobados;

        System.out.println("Numero de aprobados: " + aprobados);
        System.out.println("Numero de suspensos: " + suspensos);
        System.out.println("¿Existe algun alumno con un 10?: " + (existeDiez ? "Si" : "No"));

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una nota para contar cuantos alumnos la han obtenido: ");
        int notaBuscada = teclado.nextInt();

        int contadorNota = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == notaBuscada) {
                contadorNota++;
            }
        }
        System.out.println("Alumnos con la nota " + notaBuscada + ": " + contadorNota);

        int maxima = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > maxima) {
                maxima = notas[i];
            }
        }

        int primeraPosicion = -1;
        int ultimaPosicion = -1;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == maxima) {
                if (primeraPosicion == -1) {
                    primeraPosicion = i;
                }
                ultimaPosicion = i;
            }
        }

        System.out.println("Nota mas alta: " + maxima);
        System.out.println("Primera aparicion en la posicion: " + primeraPosicion);
        System.out.println("Ultima aparicion en la posicion: " + ultimaPosicion);

        teclado.close();
    }
}
