public class Main {
    public static void main(String[] args) {
        // Creamos una cuenta
        CuentaBancaria miCuenta = new CuentaBancaria();

        // Probamos depositar dinero
        miCuenta.depositar(100);
        miCuenta.depositar(-50);

        // Probamos retirar dinero
        miCuenta.retirar(30);
        miCuenta.retirar(100);
        miCuenta.retirar(-10);

        // Vemos cuánto queda
        System.out.println("Saldo final: $" + miCuenta.obtenerSaldo());
    }
}
