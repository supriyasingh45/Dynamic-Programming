package DynamicProgramming;

import java.util.*;

public class BuySell3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int price[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            price[i] = scn.nextInt();
        }

        int fee = scn.nextInt();
        System.out.println(BuyAndSellTransaction(price,fee));
    }

    public static int BuyAndSellTransaction(int price[], int fee){
        int oBSP = -price[0] , oSSP = 0;
        for(int i = 1 ; i < price.length ; i++){
            int nBSP = Math.max(oBSP, oSSP-price[i]);
            int nSSP = Math.max(oSSP,price[i]-fee+oBSP);

            oBSP = nBSP;
            oSSP = nSSP;
        }
        return oSSP;
    }
}
