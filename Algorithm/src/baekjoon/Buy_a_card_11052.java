package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Buy_a_card_11052 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] card = new int[N+1];
        int[][] dp = new int[N+1][N+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++){
            card[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                if(i >= j){
                    dp[i][j] = Math.max(dp[i-j][j] + card[j], dp[i][j-1]);
                } else {
                    dp[i][j] = dp[i][j-1];
                }
            }
        }
        bw.write(String.valueOf(dp[N][N]));
        bw.flush();
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }
}
