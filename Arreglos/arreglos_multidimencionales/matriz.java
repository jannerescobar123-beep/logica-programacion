package Arreglos.arreglos_multidimencionales;

public class matriz {
    public static void main(String[] args) {
        char[][] Matriz = new char[5][5];
        
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                Matriz[i][j] = '#';
            }
        }

        System.out.println("\nla matriz es:");
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                System.out.print(Matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
