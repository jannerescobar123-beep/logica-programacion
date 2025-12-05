package POO.c_Bancaria;

public class CuentaBancaria {
    private String numeroDeCuenta;
    private double saldo;
    public CuentaBancaria(String numeroDecuenta, double saldoInicial){
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldoInicial;
    }
    public void  depositar(double cantidad){
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Deposito exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("ña cantidad debe de ser mayor a cero");
        }
    }
    public void retirar (double cantidad){
        if (cantidad <= 0) {
            System.out.println("el monto debe ser mayor a cero");
        }else if (cantidad > saldo) {
            System.out.println("no tiene fondo insuficiente, no puede retirar mas de lo que tiene___ HPTA");
        } else{
            saldo -= cantidad;
            System.out.println("retiro exitoso" + cantidad);
        }
    }
    public void mostrarSaldoActual(double cantidad){
        System.out.println("su saldo actua" + cantidad);
    }
}
