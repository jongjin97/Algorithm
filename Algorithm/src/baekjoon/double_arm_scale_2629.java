package baekjoon;

import java.io.*;
import java.util.StringTokenizer;
//양팔저울
public class double_arm_scale_2629 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        int[] search = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            search[i] = Integer.parseInt(st.nextToken());
        }

        boolean[][] dp = new boolean[arr.length][40001];
        func(dp, 0, 0, arr);

        for(int i=0; i<search.length; i++){
            for(int j=0; j<dp.length; j++){
                if(dp[j][search[i]]){
                    bw.write("Y ");
                    break;
                } else if(j == dp.length-1){
                    bw.write("N ");
                }
            }
        }
        bw.flush();
    }

    public static void func(boolean[][] dp, int index, int weight, int[] arr){
        if(index == dp.length)
            return;
        if(dp[index][weight])
            return;
        dp[index][weight] = true;
        func(dp, index+1, weight, arr);
        func(dp, index+1, weight+arr[index], arr);
        func(dp, index+1, Math.abs(weight-arr[index]), arr);

    }
}
