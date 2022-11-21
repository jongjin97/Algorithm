package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Grade1_5557 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] num = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1; i<N; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        int aim = Integer.parseInt(st.nextToken());
        long[][] dp = new long[N][21];
        dp[1][num[1]] = 1;
        for(int i=2; i<N; i++){
            for(int j=0; j<21; j++){
                if(dp[i-1][j] != 0){
                    if(num[i] + j <= 20)
                        dp[i][num[i] + j] += dp[i-1][j];
                    if(j - num[i] >= 0)
                        dp[i][j - num[i]] += dp[i-1][j];
                }
            }
        }

        System.out.println(dp[N-1][aim]);
    }
}
