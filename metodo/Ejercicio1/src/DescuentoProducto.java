public class DescuentoProducto {

    public static int calcularDescuento(double precio, double porcentaje) {
        double descuento = (precio * porcentaje) / 100;
        return (int) descuento;
    }
}
