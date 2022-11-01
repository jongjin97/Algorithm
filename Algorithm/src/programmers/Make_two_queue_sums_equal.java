package programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Make_two_queue_sums_equal {

    public static void main(String[] args) {
        int[] queue1 = {1, 2, 1, 2};
        int[] queue2 = {1, 10, 1, 2};

        solution(queue1, queue2);
    }

    public static int solution(int[] queue1, int[] queue2) {
        int answer = 0;

        Queue<Integer> realQueue1 = new LinkedList<>();
        Queue<Integer> realQueue2 = new LinkedList<>();

        long sum1 = 0;
        long sum2 = 0;

        for(int i=0; i<queue1.length; i++){
            sum1 += queue1[i];
            sum2 += queue2[i];
            realQueue1.add(queue1[i]);
            realQueue2.add(queue2[i]);
        }

        while(true){
            if(answer > queue1.length*4){
                answer = -1;
                break;
            }
            if(sum1 == sum2){
                break;
            }
            else if(sum1 > sum2){
                int num = realQueue1.poll();
                realQueue2.add(num);

                sum1 -= num;
                sum2 += num;

                answer++;
            } else {
                int num = realQueue2.poll();
                realQueue1.add(num);

                sum2 -= num;
                sum1 += num;

                answer++;
            }
        }
        System.out.println(answer);
        return answer;
    }
}
