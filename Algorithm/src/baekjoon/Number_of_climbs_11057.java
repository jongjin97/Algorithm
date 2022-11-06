package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Number_of_climbs_11057 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int div = 10007;
        int[][] dp = new int[n+1][10];
        for(int i=0; i<=n; i++){
            dp[i][0] = 1;
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<10; j++){
                dp[i][j] = dp[i-1][j]%div + dp[i][j-1]%div;
            }
        }

        bw.write(String.valueOf(Arrays.stream(dp[n]).sum()%div));
        bw.flush();
    }
}
