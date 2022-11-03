package programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Get_reporting_results {

    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;

        solution(id_list, report, k);

    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, List<String>> checkMap = new HashMap<String, List<String>>();

        for(String str : id_list){
            map.put(str, 0);
            checkMap.put(str, new ArrayList<>());
        }

        for(String str : report){
            String[] tmp = str.split(" ");
            if(!checkMap.get(tmp[0]).contains(tmp[1])){
                map.put(tmp[1], map.get(tmp[1]) + 1);
                checkMap.get(tmp[0]).add(tmp[1]);
            }
        }

        for(int i=0; i<id_list.length; i++){
            AtomicInteger cnt = new AtomicInteger();
            checkMap.get(id_list[i]).stream().forEach(s -> {
                if(map.get(s) >= k)
                    cnt.incrementAndGet();
            });
            answer[i] = cnt.get();
        }

        for(int i=0; i<id_list.length; i++){
            System.out.println(id_list[i] + " : " + map.get(id_list[i]));
        }

        return answer;
    }
}
