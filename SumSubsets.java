package DynamicProgramming;

import java.util.*;
public class SumSubsets {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int coins[] = new int[n];
        for(int i =0 ; i < n; i++){
            coins[i] = scn.nextInt();

        }
        int tar = scn.nextInt();

        boolean dp[][] = new boolean[n + 1][tar + 1];

        for(int r = 0 ; r <= n ; r++){
            for(int t = 0 ; t <= tar ; t++){
                if(r == 0 && t == 0){
                    dp[0][0] = true;
                }else if( r == 0){
                    dp[r][t] = false;
                }
                else if(t == 0){
                    dp[r][t] = true;
                }else{
                    int coin = coins[r-1];
                    boolean inc = (t - coin >= 0) ? dp[r - 1][t - coin] : false;
                    boolean exc = dp[r - 1][t];

                    dp[r][t] = inc || exc;
                }
            }
            if(dp[r][tar] == true){
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}
