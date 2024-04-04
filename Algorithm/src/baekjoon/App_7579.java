package baekjoon;

import java.io.*;
import java.util.StringTokenizer;
//앱
public class App_7579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N+1];
        int[] cost = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cost[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[10000+1];
        for(int i=0; i<N; i++){
            for(int j=10000; j>=0; j--){
                if(j < cost[i])
                    break;
                dp[j] = Math.max(dp[j], dp[j-cost[i]] + arr[i]);
            }
        }

        for(int i=0; i<dp.length; i++){
            if(dp[i] >= M){
                bw.write(String.valueOf(i));
                bw.flush();
                break;
            }
        }

    }
}
