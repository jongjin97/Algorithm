package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Longest_bitonic_partial_sequence_11054 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N+1];
        int[][][] dp = new int[2][N+1][N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.fill(dp[0][0], 1);
        Arrays.fill(dp[1][0], 1);
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                if(num[i] < num[j] && i < j)
                    dp[0][i][j] = Math.max(dp[0][i][i] + 1, dp[0][i-1][j]);
                else
                    dp[0][i][j] = dp[0][i-1][j];

                int a = N-i+1;
                int b = N-j+1;

                if(num[a] < num[b] && a > b)
                    dp[1][i][b] = Math.max(dp[1][i][a] + 1, dp[1][i-1][b]);
                else
                    dp[1][i][b] = dp[1][i-1][b];
            }
        }
        int max = 0;
        for(int i=0; i<=N; i++){
            max = Math.max(max, dp[0][N][i] + dp[1][N][i]);
        }
        bw.write(String.valueOf(max-1));
        bw.flush();
    }
}
