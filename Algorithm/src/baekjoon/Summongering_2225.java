package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Summongering_2225 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int div = 1000000000;
        int[] num = new int[N+1];
        int[] dp = new int[N+1];
        for(int i=0; i<=N; i++){
            num[i] = i;
            dp[i] = 1;
        }
        for(int i=1; i< K; i++){
            for(int j=1; j<=N; j++){
                dp[j] = (dp[j-1] + dp[j])%div;
            }
        }

        bw.write(String.valueOf(dp[N]));
        bw.flush();
    }

}
