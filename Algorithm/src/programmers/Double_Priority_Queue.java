package programmers;

import java.util.PriorityQueue;

public class Double_Priority_Queue {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];

        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            return o2 - o1;
        }); // 최대 앞 최소 뒤
        PriorityQueue<Integer> queue2 = new PriorityQueue<>();

        for(int i=0; i<operations.length; i++){
            String[] tmp = operations[i].split(" ");

            if(tmp[0].equals("I")){
                queue.add(Integer.valueOf(tmp[1]));
                queue2.add(Integer.valueOf(tmp[1]));
            } else if(tmp[0].equals("D") && tmp[1].equals("1")){
                Integer max = queue.poll();
                queue2.remove(max);
            } else if(tmp[0].equals("D") && tmp[1].equals("-1")){
                Integer min = queue2.poll();
                queue.remove(min);
            }
        }
        System.out.println(queue);
        answer[0] = queue.size() > 0 ? queue.poll() : 0;
        answer[1] = queue2.size() > 0 ? queue2.poll() : 0;

        return answer;
    }
}
