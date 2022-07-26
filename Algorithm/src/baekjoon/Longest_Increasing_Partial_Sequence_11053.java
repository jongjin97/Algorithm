package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Longest_Increasing_Partial_Sequence_11053 {
    static int max = Integer.MIN_VALUE;
    static int[] dp;
    static int[] seq;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        seq = new int[size];
        dp = new int[size];
        String[] str = br.readLine().split(" ");
        for(int i=0; i<size; i++){
            seq[i] = Integer.parseInt(str[i]);
        }
        //5
        //1 4 2 3 5
        for(int i=0; i<size; i++){
            LIS(i);
        }

        bw.write(String.valueOf(Arrays.stream(dp).max().getAsInt()));
        bw.flush();
    }
    static int LIS(int N) {

        // 만약 탐색하지 않던 위치의 경우
        if(dp[N] == 0) {
            dp[N] = 1;	// 1로 초기화

            // N 이전의 노드들을 탐색
            for(int i = N - 1; i >= 0; i--) {
                // 이전의 노드 중 seq[N]의 값보다 작은 걸 발견했을 경우
                if(seq[i] < seq[N]) {
                    dp[N] = Math.max(dp[N], LIS(i) + 1);
                }
            }
        }
        return dp[N];
    }
}
