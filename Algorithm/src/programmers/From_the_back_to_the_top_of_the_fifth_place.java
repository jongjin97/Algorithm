package programmers;

import java.util.Arrays;

public class From_the_back_to_the_top_of_the_fifth_place {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length-5];
        Arrays.sort(num_list);
        for(int i=0; i<answer.length; i++){
            answer[i] = num_list[i+5];
        }
        return answer;
    }
}