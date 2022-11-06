package baekjoon;

import java.io.*;

public class Padovan_sequence_9461 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int test = Integer.parseInt(br.readLine());
        int[] arr = {0,1,1,1,2};
        for(int t=0; t<test; t++){
            int num = Integer.parseInt(br.readLine());
            long[] dp;
            if(num > 4)
                dp = new long[num+1];
            else
                dp = new long[5];
            for(int i=1; i<5; i++){
                dp[i] = arr[i];
            }
            for(int i=5; i<=num; i++){
                dp[i] = dp[i-1] + dp[i-5];
            }
            bw.write(dp[num] + "\n");
        }
        bw.flush();
    }
}
