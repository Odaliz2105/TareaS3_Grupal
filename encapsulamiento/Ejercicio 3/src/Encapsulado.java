import java.util.Scanner;

class Juegos {
    private int puntaje;
    private int total;

    public Juegos(int puntaje) {
        this.puntaje = puntaje;
        this.total = 0;
    }

    public void sumarPuntos(int puntosASumar) {
        this.total += puntosASumar;
        System.out.println("Se sumaron " + puntosASumar + " puntos. Puntaje total: " + this.total);
    }

    public int getTotal() {
        return this.total;
    }
}

public class Encapsulado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int puntos;
        Juegos juegoActual = new Juegos(0);

        do {
            System.out.println("Ingrese el puntaje a sumar ( 0 para salir ): ");
            puntos = teclado.nextInt();
            teclado.nextLine();

            if (puntos > 0) {
                juegoActual.sumarPuntos(puntos);
            } else if (puntos == 0) {
                System.out.println("Saliendo del programa de ingreso de puntajes...");
                break;
            } else {
                System.out.println("Error. No puede ingresar cantidades negativas. Intente de nuevo.");
            }
        } while (puntos != 0);

        System.out.print("Finalizado con un puntaje total de: " + juegoActual.getTotal());
        teclado.close();
    }
}
