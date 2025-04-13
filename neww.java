package DynamicProgramming;

import java.util.*;

public class neww {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int nr1 = scn.nextInt();
        int nc1 = scn.nextInt();
        int mat[][] = new int[nr1][nc1];
        for(int i = 0 ; i < nr1 ; i++){
            for(int j = 0 ; j < nc1 ; j++){
                mat[i][j] = scn.nextInt();
                System.out.println(mat[i][j]+"\t");
            }
        }
    }
}
