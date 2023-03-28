package programmers;

import java.util.ArrayList;

public class Pick_multiples_of_n {

    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int num : numlist)
            if(num%n == 0)
                list.add(num);

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
