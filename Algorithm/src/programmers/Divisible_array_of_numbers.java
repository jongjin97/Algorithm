package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class Divisible_array_of_numbers {

    public static void main(String[] args) {

    }
    public ArrayList<Integer> solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> lists = new ArrayList<>();
        for(int i : arr){
            if(i%divisor == 0)
                lists.add(i);
        }
        Collections.sort(lists);
        if(lists.size() == 0)
            lists.add(-1);
        return lists;
    }
}
