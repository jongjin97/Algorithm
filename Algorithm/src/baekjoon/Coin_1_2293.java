package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Coin_1_2293 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] coin = new int[n+1];
        int[][] dp = new int[n+1][k+1];
        for(int i =1; i<=n; i++){
            coin[i] = Integer.parseInt(br.readLine());
        }

        for(int i=0; i<=n; i++){
            dp[i][0] = 1;
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=k; j++){
                if(j>=coin[i]){
                    dp[i][j] = dp[i-1][j] + dp[i][j-coin[i]];
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        bw.write(String.valueOf(dp[n][k]));
        bw.flush();
//        for(int i=0; i<=n; i++){
//            for(int j=0; j<=k; j++){
//                System.out.print(dp[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}
