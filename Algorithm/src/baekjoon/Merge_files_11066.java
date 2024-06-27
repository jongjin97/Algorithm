package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
//파일 합치기
public class Merge_files_11066 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while (T-- >0){
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N+1];
            int[] num = new int[N+1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=1; i<=N; i++){
                int tmp = Integer.parseInt(st.nextToken());
                num[i] = tmp;
                arr[i] = tmp + arr[i-1];
            }

            int[][] dp = new int[N+1][N+1];
//            for(int i=2; i<=N; i++){
//                for(int j=i-1; j>=1; j--){
//                    dp[j][i] = Integer.MAX_VALUE;
//                    for(int k=j; k<i; k++){
//                        dp[j][i] = Math.min(dp[j][i], dp[j][k] + dp[k+1][i]);
//                    }
//                    dp[j][i] += arr[i] - arr[j-1];
//                }
//            }
            //dp[1][1] = arr[1];
            // dp[1][2] = dp[1][1] + dp[2][2]
            //dp[1][3] = dp[1][1] + dp[2][3], dp[1][2] + dp[3][3];
            //dp[1][4] = dp[1][1] + dp[2][4], dp[1][2] + dp[3][4], dp[1][3]+dp[4][4]
            // i j  =>  k = i ~ j-1;

            for(int i=1; i<=N; i++){
                Arrays.fill(dp[i], Integer.MAX_VALUE);
                dp[i][i] = num[i];
            }
            // 4,4 pass
            // 3,4
            // 2,3 2,4 3,4

            for(int i=N; i>=1; i--){
                for(int j=i+1; j<=N; j++){
                    if(j == i)
                        continue;
                    for(int k=i; k<j; k++){
                        dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k+1][j]);
                    }
                    dp[i][j] += arr[j] - arr[i-1];
                }
            }



            System.out.println(dp[1][N] - arr[N]);
        }
    }
}
