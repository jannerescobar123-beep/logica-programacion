package Arreglos.arreglos_multidimencionales;

public class matriz3 {
    public static void main(String[] args) {
        int[][] caja = {{5, 10}, {20, 50}};

        int suma = 0;

        for(int i = 0; i < caja.length;i++){
            for(int j = 0; j < caja[i].length;j++){
                suma += caja[i][j];
            }
        }
        System.out.println("la suma total es :" + suma);
    }
}
