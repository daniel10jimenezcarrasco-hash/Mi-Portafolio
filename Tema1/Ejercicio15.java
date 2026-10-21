package programacion;

public class GestionInventario {
    public static void main(String[] args) {
        
        int cantidadPociones = 2;
        double precioPocion = 15.50;
        boolean mochilaLlena = false;
        double oroTotal = 100.0;

       
        int pocionesAComprar = 3;
        double costeTotal = pocionesAComprar * precioPocion;

        System.out.println("== ESTADO INICIAL ==");
        System.out.println("Oro disponible: " + oroTotal + " monedas");
        System.out.println("Pociones en inventario: " + cantidadPociones);
        System.out.println("¿Mochila llena?: " + mochilaLlena);
        System.out.println("-----------------------------------");

       
        System.out.println("Comprando " + pocionesAComprar + " pociones por " + costeTotal + " de oro...");

        oroTotal -= costeTotal; 
        cantidadPociones += pocionesAComprar; 

      
        if (cantidadPociones >= 5) {
            mochilaLlena = true;
        }

        System.out.println("\n== ESTADO FINAL ==");
        System.out.println("Oro restante: " + oroTotal + " monedas");
        System.out.println("Cantidad actual de pociones: " + cantidadPociones);
        System.out.println("¿Mochila llena?: " + mochilaLlena);
    }
}
