public class cuentaBancaria {
    private double saldo;

    public cuentaBancaria() {
        this.saldo = 0.0;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Error: El depósito debe ser mayor que cero.");
        }
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("Error: El retiro debe ser mayor que cero.");
        } else if (monto > saldo) {
            System.out.println("Error: Fondos insuficientes. Saldo actual: $" + saldo);
        } else {
            saldo -= monto;
            System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
        }
    }

    public double obtenerSaldo() {
        return saldo;
    }
}
