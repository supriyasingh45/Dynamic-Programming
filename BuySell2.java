package DynamicProgramming;

import java.util.*;

public class BuySell2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int price[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            price[i] = scn.nextInt();
        }
        System.out.println(BuyAndSellInficinit(price));
    }

    public static int BuyAndSellInficinit(int price[]){
        int bp = 0 , sp = 0 , profit = 0;

        for(int day = 1 ; day < price.length ; day++){
            if(price[day] >= price[day -1]){
                sp = day;
            }else{
                profit += price[sp] - price[bp];
                sp = bp = day;
            }
        }
        
        profit += price[sp] - price[bp];
        return profit;

    }
}
