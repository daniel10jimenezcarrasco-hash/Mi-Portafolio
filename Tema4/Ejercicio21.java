/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author 19_1DAW
 */
public class Ejercicio21 {

    public static void main(String[] args) {
        double[][] notas = {
            {7.0, 8.0, 6.0},
            {4.0, 5.0, 6.0},
            {9.0, 8.5, 10.0},
            {5.0, 6.0, 7.0}
        };

        System.out.println("Notas de la clase");
        mostrarNotas(notas);

        System.out.println("Media por alumno");
        mostrarMediasAlumnos(notas);

        System.out.println("Media por evaluación");
        mostrarMediasEvaluaciones(notas);

        double max = notaMaxima(notas);
        System.out.printf("Nota más alta de toda la clase:", max);

        int alumnoConsultado = 2;
        double mediaAlumno = mediaDeAlumno(notas, alumnoConsultado);
        System.out.printf("Media del alumno", alumnoConsultado + 1, mediaAlumno);
    }

    public static void mostrarNotas(double[][] notas) {
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.printf("Alumno Evaluación:", i + 1, j + 1, notas[i][j]);
            }
        }
    }

    public static void mostrarMediasAlumnos(double[][] notas) {
        for (int i = 0; i < notas.length; i++) {
            double media = mediaDeAlumno(notas, i);
            System.out.printf("Alumno", i + 1, media);
        }
    }

    public static void mostrarMediasEvaluaciones(double[][] notas) {
        int numEvaluaciones = notas[0].length;
        for (int j = 0; j < numEvaluaciones; j++) {
            double suma = 0.0;
            for (int i = 0; i < notas.length; i++) {
                suma += notas[i][j];
            }
            double media = suma / notas.length;
            System.out.printf("Evaluación", j + 1, media);
        }
    }

    public static double notaMaxima(double[][] notas) {
        double max = notas[0][0];
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if (notas[i][j] > max) {
                    max = notas[i][j];
                }
            }
        }
        return max;
    }

    public static double mediaDeAlumno(double[][] notas, int indiceAlumno) {
        if (indiceAlumno < 0 || indiceAlumno >= notas.length) {
            throw new IllegalArgumentException("Índice de alumno fuera de rango: " + indiceAlumno);
        }
        double suma = 0.0;
        for (int j = 0; j < notas[indiceAlumno].length; j++) {
            suma += notas[indiceAlumno][j];
        }
        return suma / notas[indiceAlumno].length;
    }
}
