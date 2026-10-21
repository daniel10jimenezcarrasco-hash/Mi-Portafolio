public class CalculoDescuento {
    public static void main(String[] args) {
        final double DESCUENTO = 0.15;
        double precio = 120;

        double precioFinal = precio - (precio * DESCUENTO);

        System.out.println("Precio final: " + precioFinal + " créditos");
    }
}
