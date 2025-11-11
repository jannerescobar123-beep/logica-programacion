package Ciclos;

import java.util.Scanner;

public class taller_1_ciclos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 1;
        for(int i = 10; i > num; i = i - 1 ){
            System.out.println(i);
        }
        scanner.close();
    }
}
