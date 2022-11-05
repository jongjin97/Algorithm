package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Make_it_one_1463 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int[] dp = new int[num+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[num] = 0;
        for(int i=num; i>=1; i--){
            if(i%3 == 0) {
                dp[i / 3] = Math.min(dp[i] + 1, dp[i / 3]);

            }
            dp[i-1] = Math.min(dp[i-1], dp[i] + 1);

            if(i%2 == 0){
                dp[i/2] = Math.min(dp[i] + 1, dp[i/2]);
            }
        }
        System.out.println(dp[1]);
    }
}
