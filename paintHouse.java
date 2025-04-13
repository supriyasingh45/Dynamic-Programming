package DynamicProgramming;

import java.util.*;

public class paintHouse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[][] = new int[n][3];

        for(int i = 0 ; i < n ; i++){
            arr[i][0] = scn.nextInt();
            arr[i][1] = scn.nextInt();
            arr[i][2] = scn.nextInt();
        }

        int oCostRed = arr[0][0], oCoatBlue = arr[0][1], oCostGreen = arr[0][1];

        for(int h = 1 ; h < n ; h++){
            int nCostRed = arr[h][0] + Math.min(oCoatBlue,oCostGreen);
            int nCostBlue = arr[h][1] + Math.min(oCostRed,oCostGreen);
            int nCostGreen = arr[h][2] + Math.min(oCostRed,oCoatBlue);

            oCostRed = nCostRed;
            oCoatBlue = nCostBlue;
            oCostGreen = nCostGreen;
        }

        int minCost = Math.min(oCostRed,Math.min(oCoatBlue,oCostGreen));

        System.out.println(minCost);
    }
}
