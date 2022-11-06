package baekjoon;

import java.io.*;
import java.util.HashSet;

public class Tile_01_1904 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int div = 15746;
        long[] dp = new long[Math.max(3, N+1)];

        dp[1] = 1;
        dp[2] = 2;

        for(int i=3; i<=N; i++){
            dp[i] = dp[i-1]%div + dp[i-2]%div;
        }

        bw.write(String.valueOf(dp[N]%div));
        bw.flush();
    }

}
