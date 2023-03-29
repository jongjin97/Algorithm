package programmers;

import java.util.Arrays;

public class Nearest_number {

    public int solution(int[] array, int n) {
        int answer = 0;

        int dist = 100;

        for(int i=0; i<array.length; i++){
            if(dist >= Math.abs(n-array[i])){

                if(dist == Math.abs(n-array[i]))
                    answer = Math.min(answer, array[i]);
                else
                    answer = array[i];

                dist = Math.abs(n-array[i]);
            }
        }

        return answer;
    }
}
