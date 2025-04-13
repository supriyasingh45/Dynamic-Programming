package DynamicProgramming;

import java.util.*;

public class sellStocks {
    //Greedy Algorithm
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int price[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            price[i] = scn.nextInt();
        }
        System.out.println(BuyAndSell(price));
    }

    public static int BuyAndSell(int price[]){
        int bestBuy = price[0] , maxProfit = 0;
        for(int i = 1 ; i < price.length ; i++){
            if(price[i] < bestBuy){
                bestBuy = price[i];
            }else{
                if(price[i] - bestBuy > maxProfit){
                    maxProfit = price[i] - bestBuy;
                }
            }
        }
        return maxProfit;

    }

}
