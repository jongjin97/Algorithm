package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Sum_of_squared_numbers_1699 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] dp = new int[N+1];
        for(int i=1; i<=N; i++){
            dp[i] = 100000;
        }
        for(int i=1; i<=Math.sqrt(N); i++){
            for(int j=1; j<=N; j++){
                if(Math.pow(i, 2) <= j){
                    dp[j] = Math.min(dp[j],dp[(int) (j-Math.pow(i,2))] + 1);
                }
            }
        }
        System.out.println(dp[N]);
    }
}
