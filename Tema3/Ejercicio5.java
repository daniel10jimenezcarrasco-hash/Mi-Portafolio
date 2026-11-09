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

public class Ejercicio5 {
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
        
        System.out.println("\n--- Demostración de Métodos Sobrecargados (Calculadora) ---");
        Principal.ejecutarPruebasCalculadora();

        entrada.close();
    }

    public static double sumarNumeros(double a, double b) { return a + b; }
    public static double restarNumeros(double a, double b) { return a - b; }
    public static double multiplicarNumeros(double a, double b) { return a * b; }
    public static double dividirNumeros(double a, double b) { return a / b; }
}

class Calculadora {
    
    public static int multiplicar(int a, int b) {
        return a * b;
    }
    
    public static int multiplicar(int a, int b, int c) {
        return a * b * c;
    }
    
    public static double multiplicar(double a, double b) {
        return a * b;
    }
}

class Principal {
    public static void ejecutarPruebasCalculadora() {
        // Generamos números aleatorios para cada prueba en lugar de usar valores fijos
        int num1 = (int)(Math.random() * 10) + 1;
        int num2 = (int)(Math.random() * 10) + 1;
        
        int num3 = (int)(Math.random() * 5) + 1;
        int num4 = (int)(Math.random() * 5) + 1;
        int num5 = (int)(Math.random() * 5) + 1;
        
        double num6 = Math.random() * 10;
        double num7 = Math.random() * 10;

        int resultado1 = Calculadora.multiplicar(num1, num2);
        int resultado2 = Calculadora.multiplicar(num3, num4, num5);
        double resultado3 = Calculadora.multiplicar(num6, num7);

        System.out.println("1. Multiplicación de 2 enteros (" + num1 + " * " + num2 + "): " + resultado1);
        System.out.println("2. Multiplicación de 3 enteros (" + num3 + " * " + num4 + " * " + num5 + "): " + resultado2);
        System.out.println("3. Multiplicación de 2 decimales (" + String.format("%.2f", num6) + " * " + String.format("%.2f", num7) + "): " + String.format("%.2f", resultado3));
    }
}
