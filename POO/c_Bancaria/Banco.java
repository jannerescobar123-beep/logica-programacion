package POO.c_Bancaria;

public class Banco {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 =new CuentaBancaria("3231660", 10000);
        Cliente cliente1 = new Cliente("gordo hpta", cuenta1);
        
    }
}
