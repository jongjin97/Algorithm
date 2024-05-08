package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
//행렬 곱셈 순서
public class Matrix_multiplication_order_11049 {
    static int[][] pos;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        pos = new int[N+1][2];
        for(int i=1; i<=N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            pos[i][0] = Integer.parseInt(st.nextToken());
            pos[i][1] = Integer.parseInt(st.nextToken());
        }

        //dp[i][i] = 0;
        //dp[4][4] = 0;
        //dp[3][4] = (cd) = pos[3] * pos[4]   dp[3][3] + dp[4][4] + calc(pos[3], pos[4])
        //dp[2][4] = dp[2][2] * dp[3][4] || dp[2][3] * dp[3][4]

        int[][] dp = new int[N+1][N+1];
        for(int i=1; i<=N; i++){
            Arrays.fill(dp[i], Integer.MAX_VALUE);
            dp[i][i] = 0;
        }
        for(int i=N; i>0; i--){
            for(int j=i+1; j<=N; j++){
                for(int k=i; k<j; k++){
                    if(dp[i][k] == Integer.MAX_VALUE)
                        dp[i][k] = 0;
                    if(dp[k+1][j] == Integer.MAX_VALUE)
                        dp[k+1][j] = 0;
                    dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k+1][j] + func(i, k, j));
                    //dp[i][j] = Math.min(dp[i][j], func(i, k, j));

                }
            }
        }

        System.out.println(dp[1][N]);
    }
    public static int func(int i, int k, int j){
        int a = pos[i][0];
        int b = pos[k][1];
        int c = pos[j][1];
        int sum = a*b*c;
//        a = pos[k+1][0];
//        b = pos[k+1][1];
//        c = pos[j][1];
//        sum += a*b*c;
        return sum;
    }
}
