package programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Study_coding_test {
    static int result = 1000000;
    public static void main(String[] args) {
        int alp = 10;
        int cop = 10;

        int[][] problems = {{10,15,2,1,2}, {20,20,3,3,4}};

        System.out.println(solution(alp,cop,problems));

        alp = 0;
        cop = 0;
        int[][] problems2 = {{0,0,2,1,2}, {4,5,3,1,2}, {4,11,4,0,2}, {10,4,0,4,2}};
        System.out.println(solution(alp,cop,problems2));

        int[][] problems3 = {{1,1,1,1,1}};
        System.out.println(solution(alp,cop,problems3));
    }
    public static int solution(int alp, int cop, int[][] problems) {
        int almax = 0;
        int comax = 0;

        for(int[] problem : problems){
            almax = Math.max(problem[0], almax);
            comax = Math.max(problem[1], comax);
        }
        int[][] dp = new int[Math.max(alp, almax)+1][Math.max(cop, comax)+1];
        for(int[] arr : dp){
            Arrays.fill(arr, Integer.MAX_VALUE);
        }

        dp[Math.min(alp,almax)][Math.min(comax,cop)] = 0;

        if(alp >= almax && cop >= comax){
            return 0;
        }

        for(int i=Math.min(alp,almax); i<=almax; i++){
            for(int j=Math.min(comax,cop); j<=comax; j++){
                if(i<almax){
                    dp[i+1][j] = Math.min(dp[i][j]+1, dp[i+1][j]);
                }
                if(j<comax){
                    dp[i][j+1] = Math.min(dp[i][j]+1, dp[i][j+1]);
                }

                for(int[] problem : problems){
                    if(i >= problem[0] && j >= problem[1]){
                        dp[Math.min(almax, i+problem[2])][Math.min(comax, j+problem[3])] =
                                Math.min(dp[Math.min(almax, i+problem[2])][Math.min(comax, j+problem[3])], dp[i][j] + problem[4]);
                    }
                }
            }
        }


        return dp[almax][comax];
    }
}
