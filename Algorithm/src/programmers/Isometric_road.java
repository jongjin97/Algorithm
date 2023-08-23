package programmers;

public class Isometric_road {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int[][] dp = new int[n+1][m+1];
        dp[1][1] = 1;
        for(int i=0; i<puddles.length; i++){
            dp[puddles[i][1]][puddles[i][0]] = -1;
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(dp[i][j] == -1) {
                }
                else if(dp[i][j-1] == -1){
                    dp[i][j] = (dp[i-1][j] + dp[i][j])%1000000007;
                }
                else if(dp[i-1][j] == -1){
                    dp[i][j] = (dp[i][j-1] + dp[i][j])%1000000007;
                }
                else if(dp[i-1][j] != -1 && dp[i][j-1] != -1) {
                    dp[i][j] = (dp[i - 1][j] + dp[i][j - 1] + dp[i][j])%1000000007;
                }
            }
        }
//        for(int i=0; i<=n; i++){
//            for(int j=0; j<=m; j++){
//                System.out.print(dp[i][j] + " ");
//            }
//            System.out.println();
//        }

        return dp[n][m];
    }
}
//0 1 1 1
//1 0 1 2
//1 1 2 4