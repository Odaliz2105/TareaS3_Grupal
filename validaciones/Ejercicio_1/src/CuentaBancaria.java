public class CuentaBancaria {
    private double saldo; // solo esta clase puede ver o cambiar el dinero

    // Constructor: se llama automáticamente al crear la cuenta
    public CuentaBancaria() {
        this.saldo = 0.0; // el saldo empieza en 0
    }

    // Método para depositar dinero
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto; // suma al saldo
            System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("No se puede depositar un monto menor o igual a cero.");
        }
    }

    // Método para retirar dinero
    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a retirar debe ser mayor que cero.");
        } else if (monto > saldo) {
            System.out.println("No puedes retirar más de lo que tienes. Saldo: $" + saldo);
        } else {
            saldo -= monto; // resta al saldo
            System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
        }
    }

    // Método para ver el saldo actual
    public double obtenerSaldo() {
        return saldo;
    }
}
