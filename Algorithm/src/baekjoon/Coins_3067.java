package baekjoon;

import java.io.*;
import java.util.StringTokenizer;
//Coins
public class Coins_3067 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        while (T-- >0){
            int N = Integer.parseInt(br.readLine());
            int[] coin = new int[N+1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=1; i<=N; i++){
                coin[i] = Integer.parseInt(st.nextToken());
            }
            int M = Integer.parseInt(br.readLine());

            int[][] dp = new int[N+1][M+1];

            for(int i=1; i<=N; i++){
                dp[i-1][coin[i]]++;
                for(int j=1; j<=M; j++){
                    if(j-coin[i] >= 0)
                        dp[i][j] = Math.max(dp[i][j], dp[i-1][j] + dp[i][j-coin[i]]);
                    else
                        dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }

            System.out.println(dp[N][M]);
        }
    }
}
