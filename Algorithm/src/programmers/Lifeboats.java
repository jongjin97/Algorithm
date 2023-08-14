package programmers;

import java.util.Arrays;

public class Lifeboats {

    public int solution(int[] people, int limit) {
        int answer = 0;
        boolean[] check = new boolean[people.length];
        Arrays.sort(people);
        int cnt = 0;
        int right = people.length-1;

        for(int i=0; i<right; i++){
            if(check[i])
                continue;
            for(int j=right; j>i; j--){
                if(!check[i] && !check[j] && people[i] + people[j] <= limit){
                    cnt++;
                    check[i] = true;
                    check[j] = true;
                    right = j;
                    break;
                } else if(j == i+1){
                    right=j;
                }
            }
        }
        answer = people.length - cnt;
        return answer;
    }
}
