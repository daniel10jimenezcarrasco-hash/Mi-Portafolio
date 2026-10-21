import java.util.Scanner;

public class Circunferencia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        final double PI = 3.141592653589793;

        System.out.print("Introduce el radio: ");
        double radio = teclado.nextDouble();

        double longitud = 2 * PI * radio;
        double area = PI * radio * radio;

        System.out.println("Longitud: " + longitud);
        System.out.println("Área: " + area);

        teclado.close();
    }
}