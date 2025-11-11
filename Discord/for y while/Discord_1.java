import java.util.Scanner;
public class Discord_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();
        if (numero1 > numero2){
            for(int i = 100000; i>=-500; i--){
                System.out.println(i);
            }
        }else{
            System.out.print("El numero 1 debe ser mayor que el numero 2");
        }
        entrada.close();
    }
}