package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class ordinary_backpack_2_12920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N+1][4];
        for(int i=1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
            arr[i][3] = arr[i][2];
        }
        int[][] dp = new int[N+1][M+1];

        for(int i=1; i<=N; i++){
            for(int j=arr[i][0]; j<=M; j++){
                // dp[i][j] = dp[i-arr[i][1]][j] if(arr[i][2] > 0) + arr[i][1]
                if(j % arr[i][0] == 0 && arr[i][2] > 0){
                    dp[i][j] = Math.max(dp[i-1][j - arr[i][0]] + arr[i][1], dp[i][j-1] + arr[i][1]);
                    arr[i][2]--;
                } else {
//                    dp[i][j] = dp[i-1][j-arr[i][0]] + dp[i][arr[i]]    , dp[i][j-1]
//                            // dp[2][9] = 7 = dp[1][9-arr[i][0]] + dp[2][arr[i]]
//                            // dp[2][10]= 9 = dp[1][9]
                    for(int k=arr[i][0]; k<=arr[i][0]*arr[i][3]; k+=arr[i][0]){
                        if(j < k)
                            break;
                        dp[i][j] = Math.max(dp[i-1][j-k] + dp[i][k], Math.max(dp[i][j-1], dp[i][j]));
                    }
                }

            }
        }
        int result = 0;
        for(int i=0; i<dp.length; i++){
            result = Math.max(result, dp[i][M]);
        }
        System.out.println(result);
    }
}
