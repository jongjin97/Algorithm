package programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Process {

    public int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<int[]> queue = new LinkedList<>();
        for(int i=0; i<priorities.length; i++){
            queue.add(new int[] {i, priorities[i]});
        }
        Arrays.sort(priorities);
        int index = priorities.length-1;
        while(!queue.isEmpty()){
            int[] tmp = queue.poll();

            if(tmp[1] == priorities[index]){
                answer++;
                if(location == tmp[0])
                    break;
                else
                    index--;
            } else {
                queue.add(tmp);
            }
        }

        return answer;
    }
}
