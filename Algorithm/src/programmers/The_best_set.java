package programmers;

import java.util.Arrays;

public class The_best_set {
    public int[] solution(int n, int s) {
        int[] answer = new int[n];

        int mid = s/n;
        Arrays.fill(answer, mid);
        int sum = mid * n;
        int right = n-1;
        if(mid == 0)
            return new int[] {-1};
        while(true){
            if(right < 0)
                break;
            if(sum == s)
                break;
            if(sum < s){
                answer[right] += 1;
                sum+=1;
                right--;
            }
        }

        return answer;
    }


}
