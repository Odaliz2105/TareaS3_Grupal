public class Main { // clase obligatoria

    public static void main(String[] args) {

        double precioOriginal = 150.75;
        double porcentajeDescuento = 20.0;

        int descuento = DescuentoProducto.calcularDescuento(precioOriginal, porcentajeDescuento);
        System.out.println("El precio es: $" + precioOriginal);
        System.out.println("El porcentaje de descuento es: $" + porcentajeDescuento);
        System.out.println("El descuento es: "+ descuento);

    }
}
