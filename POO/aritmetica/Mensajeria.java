package POO.aritmetica;

import java.util.Scanner;

public class Mensajeria {
    
    public void Bienvenida(){
        System.out.println("bienvenido usuario a la calculadora insana!");
    }
    public void Despedida(){
        System.out.println("gracias por usar la calculadora insana, hasta luego!");
    }
    public void MostrarResultado(double resultado){
        System.out.println("El resultado es: " + resultado);
    }
    public void mostrarMenu(){
        System.out.println("============    Calculadora     ============");
            System.out.println("- Que operacion desea hacer:");
            System.out.println(" 1. ----> SUMA");
            System.out.println(" 2. ----> RESTA");
            System.out.println(" 3. ----> MULTIPLICACION");
            System.out.println(" 4. ----> DIVICION");
            System.out.println(" 5. ----> SALIR...");
    }
    public double pedirNumeros(String mensaje) {
    Scanner sc = new Scanner(System.in);
        System.out.println(mensaje);
        sc.close();
    return sc.nextDouble();
    
}

public void mensajeSalir(){
    System.out.println("Saliendo...");
}
public void opcionIncorrecta(){
    System.out.println("opcion no valida");
}

}

