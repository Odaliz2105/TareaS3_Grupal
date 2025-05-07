public class Main {
    public static void main(String[] args) {
        double precioProducto = 200.0; // precio del producto

        //Llamada método desde la clase CalcularIva
        double iva = CalcularIva.calcularIva(precioProducto);

        System.out.println("El IVA del producto es: $" + iva);
    }
}
