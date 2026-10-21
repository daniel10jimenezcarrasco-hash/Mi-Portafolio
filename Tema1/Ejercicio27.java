public class EvaluacionExpresiones {

    public static void main(String[] args) {
        System.out.println("=== EVALUACIÓN DE EXPRESIONES (EJERCICIO 27) ===");
        System.out.println();

        boolean res1 = 10 + 5 * 2 > 20 && 4 == 4;
        System.out.println("1. 10 + 5 * 2 > 20 && 4 == 4");
        System.out.println("   Resultado: " + res1);
        System.out.println();

        boolean res2 = !(7 + 3 > 10) || 3 * 2 <= 6;
        System.out.println("2. !(7 + 3 > 10) || 3 * 2 <= 6");
        System.out.println("   Resultado: " + res2);
        System.out.println();

        boolean res3 = 10 / 2 + 3 * 5 == 19 && true;
        System.out.println("3. 10 / 2 + 3 * 5 == 19 && true");
        System.out.println("   Resultado: " + res3);
        System.out.println();

        int x = 5;
        x += 3 * 2;
        System.out.println("4. int x = 5; x += 3 * 2;");
        System.out.println("   Resultado (valor de x): " + x);
        System.out.println();

        boolean b = false;
        b = !b || 7 % 2 == 1;
        System.out.println("5. boolean b = false; b = !b || 7 % 2 == 1;");
        System.out.println("   Resultado (valor de b): " + b);
        System.out.println("==============================================");
    }
}
