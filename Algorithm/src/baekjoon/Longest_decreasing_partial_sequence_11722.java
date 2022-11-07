package baekjoon;

import java.io.*;
import java.util.*;

public class Longest_decreasing_partial_sequence_11722 {
    //6
    //10 30 10 20 20 10
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] num = new int[N+1];
        int[] dp = new int[N+1];
        for(int i=1; i<=N; i++){
            num[i] = Integer.parseInt(st.nextToken());

        }
        dp[1] = 1;
        for(int i=1; i<=N; i++){
            for(int j=i; j<=N; j++){
                if(i == j)
                    dp[i] = Math.max(dp[i], 1);
                if(num[i] > num[j]){
                    dp[j] = Math.max(dp[j], dp[i] + 1);
                }
            }
        }

        bw.write(String.valueOf(Arrays.stream(dp).max().getAsInt()));
        bw.flush();
    }
}
