import java.util.Scanner;

public class MediaTrimestres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CÁLCULO DE NOTA MEDIA ===");
        
        System.out.print("Introduce la nota del 1er trimestre: ");
        int nota1 = scanner.nextInt();

        System.out.print("Introduce la nota del 2º trimestre: ");
        int nota2 = scanner.nextInt();

        System.out.print("Introduce la nota del 3er trimestre: ");
        int nota3 = scanner.nextInt();

        double mediaExpediente = (double) (nota1 + nota2 + nota3) / 3;

        int mediaBoletin = (int) mediaExpediente;

        System.out.println("\n----------------------------------------");
        System.out.println("RESULTADOS:");
        System.out.printf("Nota media (expediente académico): %.2f%n", mediaExpediente);
        System.out.println("Nota media (boletín de calificaciones): " + mediaBoletin);
        System.out.println("----------------------------------------");

        scanner.close();
    }
}
