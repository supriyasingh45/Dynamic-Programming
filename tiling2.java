package DynamicProgramming;

import java.util.*;

public class tiling2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int dp[] = new int[n+1];

        for(int len = 0 ; len <= n ; len++){
            if(len < m){
                dp[len] = 1;
            }
            else if(len == m){
                dp[len] = 2;
            }else{
                dp[len] = dp[len-1] + dp[len-m];
            }
        }

        System.out.println(dp[n]);
    }
}
