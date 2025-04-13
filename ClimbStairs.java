package DynamicProgramming;

public class ClimbStairs {
    public static void main(String[] args) {
        int n = 4;
        int ways = climbStairs(n, new int[n+1]);
        System.out.println(ways);
    }

    public static int climbStairs(int n, int dp[]){
        if(n == 0){
            return 1;
        }
        if(dp[n] != 0){
            return dp[n];
        }

        int tways = 0;

        if(n-1 >= 0){
            tways += climbStairs(n-1,dp);
        }

        if(n-2 >= 0){
            tways +=climbStairs(n-2,dp);
        }

        if(n-3 >= 0){
            tways += climbStairs(n-3,dp);
        }

        return dp[n] = tways;
    }
}
