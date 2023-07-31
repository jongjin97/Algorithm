package programmers;

import java.util.Stack;

public class Find_the_big_number_behind_you {

    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < numbers.length; i++) {
            while (!stack.isEmpty() && numbers[i] > numbers[stack.peek()]) {
                int index = stack.pop();
                answer[index] = numbers[i];
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            int index = stack.pop();
            answer[index] = -1;
        }
        return answer;
    }
}
