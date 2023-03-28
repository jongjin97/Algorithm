package programmers;

import java.util.Arrays;

public class Similarity_of_arrays {

    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        for(String str : s1){
            for(String str2 : s2){
                answer = str.equals(str2) ? answer+1 : answer;
            }
        }

        return answer;
    }
}
