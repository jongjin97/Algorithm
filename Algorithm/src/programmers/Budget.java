package programmers;

import java.util.Arrays;

public class Budget {

    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);
        int sum = 0;
        for(int i=0; i<d.length; i++){
            sum += d[i];
            if(sum <= budget)
                answer++;
        }
        return answer;
    }

    public void dfs(int[] d, int budget, int sum, int index, int cnt){
        if(sum > budget)
            return;
        if(index == d.length)
            return;
        for(int i=index; i<d.length; i++){
            if(sum + d[i] <= budget)
                dfs(d, budget, sum + d[i], i + 1, cnt + 1);
        }

    }
}
