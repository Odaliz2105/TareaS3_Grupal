import java.util.Scanner;

class Juego {
    int puntaje;
    int total;

    public Juego(int puntajeInicial) {
        this.puntaje = puntajeInicial;
        this.total = 0;
    }

    public void agregarPuntaje(int puntosAAgregar) {
        this.total += puntosAAgregar;
        System.out.println("Se agregaron " + puntosAAgregar + " puntos. Puntaje total: " + this.total);
    }

    public int getTotal() {
        return this.total;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int puntos;
        Juego juegoActual = new Juego(0);

        do {
            System.out.println("Ingrese el puntaje a agregar ( 0 para salir ): ");
            puntos = teclado.nextInt();
            teclado.nextLine();

            if (puntos > 0) {
                juegoActual.agregarPuntaje(puntos);
            } else if (puntos == 0) {
                System.out.println("Saliendo del sistema de ingreso de puntajes...");
                break;
            } else {
                System.out.println("Error, no puede ingresar cantidades negativas. Intente de nuevo");
            }
        } while (puntos != 0);

        System.out.print("Finalizado con un puntaje total de: " + juegoActual.getTotal());
        teclado.close();
    }
}
