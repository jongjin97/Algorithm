package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Fruit_longevity {

    public int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=score.length-1; i>=0; i-=m){
            int min = Integer.MAX_VALUE;
            if(i >= m-1) {
                for (int j = 0; j < m; j++) {
                    min = Math.min(score[i - j], min);
                }
                System.out.println(min);
                arrayList.add(min);
            }
        }

        for(int i : arrayList){
            answer += i*m;
        }

        return answer;
    }
}
