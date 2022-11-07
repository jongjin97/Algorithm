package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Coin_2_2294 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] dp = new int[k+1];
        int[] coin = new int[n+1];

        for(int i=1; i<=n; i++){
            coin[i] = Integer.parseInt(br.readLine());
        }
        Arrays.fill(dp, 100000);
        dp[0] = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=k; j++){
                if(coin[i] <= j){
                    dp[j] = Math.min(dp[j], dp[j - coin[i]] + 1);
                }
            }
        }
        if(dp[k] != 100000)
            bw.write(String.valueOf(dp[k]));
        else
            bw.write("-1");
        bw.flush();
    }
}
