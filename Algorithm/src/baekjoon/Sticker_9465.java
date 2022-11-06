package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Sticker_9465 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int test = Integer.parseInt(br.readLine());

        for(int t=0; t<test; t++){
            int n = Integer.parseInt(br.readLine());
            int[][] sticker = new int[2][n+1];
            int[][] dp = new int[2][n+1];
            for(int i=0; i<2; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j=1; j<=n; j++){
                    sticker[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            dp[0][1] = sticker[0][1];
            dp[1][1] = sticker[1][1];
            for(int j=2; j<=n; j++){
                dp[0][j] = Math.max(dp[1][j-1] + sticker[0][j],
                        Math.max(dp[0][j-2] + sticker[0][j], dp[1][j-2] + sticker[0][j]));

                dp[1][j] = Math.max(dp[0][j-1] + sticker[1][j],
                        Math.max(dp[1][j-2] + sticker[1][j], dp[0][j-2] + sticker[1][j]));
            }
            bw.write(String.valueOf(Math.max(dp[0][n], dp[1][n])));
            bw.newLine();
        }
        bw.flush();
    }
}
