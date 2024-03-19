package baekjoon;

import java.io.*;
import java.util.StringTokenizer;
//수강 과목
public class Subjects_taken_17845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] sub = new int[K][2];
        for(int i=0; i<K; i++){
            st = new StringTokenizer(br.readLine());
            sub[i][0] = Integer.parseInt(st.nextToken());
            sub[i][1] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[N+1];

        for(int i=0; i<K; i++){
            for(int j=N; j>=sub[i][1]; j--){
                dp[j] = Math.max(dp[j], dp[j - sub[i][1]] + sub[i][0]);
            }
        }

        System.out.println(dp[N]);
    }
}
