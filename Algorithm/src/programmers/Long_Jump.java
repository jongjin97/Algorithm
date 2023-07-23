package programmers;

public class Long_Jump {
    public long solution(int n) {
        long answer = 0;

        int[] dp = new int[Math.max(n+1, 2)];
        dp[1] = 1;
        if(dp.length>2)
            dp[2] = 2;
        for(int i=3; i<dp.length; i++){
            dp[i] = (dp[i-1] + dp[i-2])%1234567;
        }
        answer = dp[n];
        return answer;
    }
}
