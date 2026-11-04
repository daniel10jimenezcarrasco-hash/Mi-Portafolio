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

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero:");
        double num1 = entrada.nextDouble();
        System.out.println("Introduce el segundo numero:");
        double num2 = entrada.nextDouble();

        System.out.println("Introduce la operacion:\n 1-Suma\n 2-Resta\n 3-Multiplicacion\n 4-Division");
        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                System.out.println(num1 + " + " + num2 + " = " + sumarNumeros(num1, num2));
                break;
            case 2:
                System.out.println(num1 + " - " + num2 + " = " + restarNumeros(num1, num2));
                break;
            case 3:
                System.out.println(num1 + " * " + num2 + " = " + multiplicarNumeros(num1, num2));
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("No se puede dividir entre 0");
                } else {
                    System.out.println(num1 + " / " + num2 + " = " + dividirNumeros(num1, num2));
                }
                break;
            default:
                System.out.println("Operacion no valida");
        }
        entrada.close();
    }

    public static double sumarNumeros(double a, double b) { return a + b; }
    public static double restarNumeros(double a, double b) { return a - b; }
    public static double multiplicarNumeros(double a, double b) { return a * b; }
    public static double dividirNumeros(double a, double b) { return a / b; }
}