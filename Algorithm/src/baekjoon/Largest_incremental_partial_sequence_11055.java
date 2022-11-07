package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Largest_incremental_partial_sequence_11055 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];
        int[] dp = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        dp[0] = num[0];
        for(int i=0; i<N; i++){
            for(int j=i; j<N; j++){
                if(i == j){
                    dp[j] = Math.max(dp[j], num[j]);
                }
                if(num[i] < num[j]){
                    dp[j] = Math.max(dp[i] + num[j], dp[j]);
                }
            }
        }

        for(int i : dp)
            System.out.print(i + " ");
        System.out.println();
        bw.write(String.valueOf(Arrays.stream(dp).max().getAsInt()));
        bw.flush();
    }
}
