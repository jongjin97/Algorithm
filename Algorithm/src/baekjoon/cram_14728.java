package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
//벼락치기
public class cram_14728 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int[][] study = new int[N][2];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            study[i][0] = Integer.parseInt(st.nextToken());
            study[i][1] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[T+1];

        for(int i=0; i<N; i++){
            for(int j=T; j>=study[i][0]; j--){
                dp[j] = Math.max(dp[j], dp[j - study[i][0]] + study[i][1]);
            }
        }

        System.out.println(dp[T]);
    }
}
