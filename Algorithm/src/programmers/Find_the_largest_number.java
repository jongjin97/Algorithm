package programmers;

import java.util.Arrays;

public class Find_the_largest_number {

    public int[] solution(int[] array) {
        int[] answer = new int[2];

        for (int i = 0; i < array.length; i++) {
            if(answer[0] < array[i]){
                answer[0] = array[i];
                answer[1] = i;
            }
        }



        return answer;
    }
}
