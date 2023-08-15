package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class costume {
    public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, ArrayList<String>> hashMap = new HashMap<>();

        for(int i=0; i<clothes.length; i++){
            if(!hashMap.containsKey(clothes[i][1])){
                hashMap.put(clothes[i][1], new ArrayList<>());
                hashMap.get(clothes[i][1]).add(clothes[i][0]);
            } else {
                hashMap.get(clothes[i][1]).add(clothes[i][0]);
            }
        }

        for(ArrayList arrayList : hashMap.values()){
            answer *= arrayList.size()+1;
        }

        return answer-1;
    }
}
