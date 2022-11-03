package programmers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Parking_fee_calculation {

    public static void main(String[] args) {
        int[] fees = {180, 5000, 10, 600};
        String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT",
                "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};

        solution(fees, records);

        int[] fees2 = {1,461,1,10};
        String[] records2 = {"00:00 1234 IN"};

        solution(fees2, records2);
    }

    public static int[] solution(int[] fees, String[] records) {
        HashMap<String, String> hashMap = new HashMap<>();
        HashMap<String, Integer> stack = new HashMap<>();
        for(int i=0; i<records.length; i++){
            String[] str = records[i].split(" ");
            if(str[2].equals("IN")){
                hashMap.put(str[1], str[0]);
                if(!stack.containsKey(str[1]))
                    stack.put(str[1], 0);
            } else {
                if(!stack.containsKey(str[1]))
                    stack.put(str[1], 0);
                String[] time = str[0].split(":");
                String tmp = hashMap.get(str[1]);
                String[] enter = tmp.split(":");

                int hour = Integer.parseInt(time[0]) - Integer.parseInt(enter[0]);
                int minute = Integer.parseInt(time[1]) - Integer.parseInt(enter[1]);

                stack.put(str[1], stack.get(str[1]) + hour*60 + minute);
                hashMap.put(str[1], "");
            }
        }
        hashMap.forEach((s, s2) -> {
            if(!s2.equals("")){
                String tmp = hashMap.get(s);
                String[] enter = tmp.split(":");

                int hour = 23 - Integer.parseInt(enter[0]);
                int minute = 59 - Integer.parseInt(enter[1]);

                stack.put(s, stack.get(s) + hour*60 + minute);
            }
        });
        ArrayList<String> list = new ArrayList();

        hashMap.forEach((s, s2) -> {
            list.add(s);
        });
        list.sort((o1, o2) -> o1.compareTo(o2));
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            double time = stack.get(list.get(i)) - fees[0];

            if(time <= 0){
                answer[i] = fees[1];
            } else {
                double tmp = time/fees[2];
                tmp = Math.ceil(tmp);
                answer[i] = (int) (tmp*fees[3]) + fees[1];
            }
        }

        return answer;
    }
}
