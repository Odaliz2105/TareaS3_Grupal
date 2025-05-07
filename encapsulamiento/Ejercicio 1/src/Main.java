import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        cuentaBancaria miCuenta = new cuentaBancaria();
        int opcion;

        do {
            System.out.println("\n----- MENÚ -----");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el monto a depositar: ");
                    double deposito = scanner.nextDouble();
                    miCuenta.depositar(deposito);
                    break;

                case 2:
                    System.out.print("Ingresa el monto a retirar: ");
                    double retiro = scanner.nextDouble();
                    miCuenta.retirar(retiro);
                    break;

                case 3:
                    System.out.println("Saldo actual: $" + miCuenta.obtenerSaldo());
                    break;

                case 4:
                    System.out.println("Gracias por usar el sistema bancario.");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
