package programmers;

import java.util.Arrays;

public class Fatigue {
    int result = 0;
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        boolean[] check = new boolean[dungeons.length];
        // [[80,20],[50,40],[30,10]]

        rec(k, dungeons, check, 0);

        return result;
    }

    public void rec(int k, int[][] dungeons, boolean[] check, int cnt){
        for(int i=0; i<check.length; i++){
            if(!check[i] && k >= dungeons[i][0]){
                check[i] = true;
                rec(k-dungeons[i][1], dungeons, check, cnt + 1);
                check[i] = false;
            }
        }
        result = Math.max(result, cnt);
    }
}
