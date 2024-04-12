package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
//호텔
public class Hotel_1106 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][2];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[2000];
        Arrays.fill(dp, 210000000);
        dp[0] = 0;
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<N; j++){
                if(i-arr[j][1] >= 0) {
                    dp[i] = Math.min(dp[i], dp[i-arr[j][1]] + arr[j][0]);
                }
            }
        }
        int res = Integer.MAX_VALUE;
        for(int i=C; i<dp.length; i++){
            res = Math.min(dp[i], res);
        }

        System.out.println(res);
    }
}
