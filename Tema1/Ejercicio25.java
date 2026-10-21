import java.util.Scanner;

public class BeneficiosFruteria {

    // Constantes con los precios por kilo de cada fruta
    private static final double PRECIO_MANZANA = 2.35;
    private static final double PRECIO_PERA = 1.95;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CÁLCULO DE BENEFICIOS ANUALES - FRUTERÍA ===");
        System.out.println();

        // 1. Recogida de datos de Manzanas
        System.out.println("--- MANZANAS (Precio: " + PRECIO_MANZANA + " €/kg) ---");
        System.out.print("Introduce los kilos vendidos en el 1er semestre: ");
        double manzanasS1 = scanner.nextDouble();
        
        System.out.print("Introduce los kilos vendidos en el 2º semestre: ");
        double manzanasS2 = scanner.nextDouble();

        // 2. Recogida de datos de Peras
        System.out.println("\n--- PERAS (Precio: " + PRECIO_PERA + " €/kg) ---");
        System.out.print("Introduce los kilos vendidos en el 1er semestre: ");
        double perasS1 = scanner.nextDouble();
        
        System.out.print("Introduce los kilos vendidos en el 2º semestre: ");
        double perasS2 = scanner.nextDouble();

        // 3. Cálculos
        // Totales en kilos
        double totalKilosManzanas = manzanasS1 + manzanasS2;
        double totalKilosPeras = perasS1 + perasS2;

        // Importes económicos
        double importeManzanas = totalKilosManzanas * PRECIO_MANZANA;
        double importePeras = totalKilosPeras * PRECIO_PERA;
        double importeTotalAnual = importeManzanas + importePeras;

        // 4. Mostrar resultados
        System.out.println("\n===============================================");
        System.out.println("             RESUMEN DE VENTAS ANUALES         ");
        System.out.println("===============================================");
        
        System.out.printf("Manzanas: %.2f kg -> %.2f €%n", totalKilosManzanas, importeManzanas);
        System.out.printf("Peras:    %.2f kg -> %.2f €%n", totalKilosPeras, importePeras);
        
        System.out.println("-----------------------------------------------");
        System.out.printf("IMPORTE TOTAL ANUAL: %.2f €%n", importeTotalAnual);
        System.out.println("===============================================");

        scanner.close();
    }
}
