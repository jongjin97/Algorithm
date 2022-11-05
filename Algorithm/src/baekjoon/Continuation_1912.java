package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Continuation_1912 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] num = new int[N];
        for(int i=0; i<num.length; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        int[] dp = new int[N];
        dp[0] = num[0];

        for(int i =1; i<N; i++){
            dp[i] = Math.max(dp[i-1] + num[i], num[i]);
        }

        System.out.println(Arrays.stream(dp).max().getAsInt());
    }
}
