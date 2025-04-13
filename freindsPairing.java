package DynamicProgramming;

import java.util.*;
import java.io.*;

public class freindsPairing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int f = 1 , s = 1;

        for(int i = 2 ; i <= n ; i++){
            int t = (i-1)*f + (s);

            f = s;
            s = t;
        }

        System.out.println(s);
    }
}
