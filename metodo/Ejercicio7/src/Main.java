import java.text.DecimalFormat;
import java.util.Scanner;


class Productos {
    float precio;
    float dscto;
    float total;

    public float calcularPrecioConDescuento(float precio, float dscto) {
        this.precio = precio;
        this.dscto = dscto;
        System.out.println("Tiene un descuento del " + dscto + "%");
        dscto /= 100;
        this.total = precio * (1 - dscto);
        return this.total;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Ingrese el precio del producto (USD): ");
        float precio = teclado.nextFloat();
        teclado.nextLine();
        System.out.println("Ingrese el descuento del producto ( n% ): ");
        float dscto = teclado.nextFloat();
        teclado.nextLine();
        Productos Producto1 = new Productos();
        Producto1.calcularPrecioConDescuento(precio, dscto);

        System.out.println("El valor total del producto es: " + df.format(Producto1.calcularPrecioConDescuento(precio, dscto)));
        teclado.close();
    }
}
