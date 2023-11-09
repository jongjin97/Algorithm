package programmers;

import java.util.HashSet;

public class Number_of_consecutive_subsequence_sums {
    HashSet<Integer> set = new HashSet<>();
    public int solution(int[] elements) {
        int answer = 0;
        for(int i = 0; i < elements.length; i++) {
            dfs(elements, i, 0, 0);
        }
        System.out.println(set);
        return set.size()-1;
    }

    public void dfs(int[] elements, int idx, int sum, int cnt) {
        set.add(sum);
        if(cnt == elements.length) {
            return;
        }
        dfs(elements, idx+1 == elements.length ? 0 : idx+1, sum + elements[idx], cnt+1);
    }
}
