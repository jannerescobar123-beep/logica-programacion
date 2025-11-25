package Arreglos.arreglos_multidimencionales;

import java.util.Arrays;

public class matriz2 {
    public static void main(String[] args) {
        String[][] triqui = new String[3][3];

        for (int i = 0; i < triqui.length; i++) {
            for (int j = 0; j < triqui[i].length; j++) {
                triqui[i][j] = "-";
            }
        }
        triqui[1][1] = "X";
        triqui[0][0] = "O";
        
        for (int i = 0; i < triqui.length; i++) {
            System.out.println(Arrays.deepToString(triqui[i]));
        }
    }
}
