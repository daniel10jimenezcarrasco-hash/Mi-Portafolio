public class RangoShort {
    public static void main(String[] args) {
        short maximo = 32767;

        System.out.println("Valor máximo: " + maximo);

        maximo++;

        System.out.println("Después de sumar 1: " + maximo);
        System.out.println("Valor mínimo esperado: -32768");
    }
}
