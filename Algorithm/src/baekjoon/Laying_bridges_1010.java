package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Laying_bridges_1010 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int test = Integer.parseInt(br.readLine());

        for(int t=0; t<test; t++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int[][] dp = new int[N+1][M+1];

            for(int i=1; i<=N; i++){
                for(int j=1; j<=M - (N-i); j++){
                    if(i <= j)
                        dp[i][j] = 1;
                }
            }

            for(int i=1; i<N; i++){
                int sum = 0;
                for(int j=1; j<M; j++){
                    if(dp[i][j] != 0){
                        sum += dp[i][j];
                        dp[i+1][j+1] = sum;
                    }
                }
            }

            System.out.println(Arrays.stream(dp[N]).sum());
        }
    }
}
