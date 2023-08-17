package programmers;

import java.util.Stack;

public class Remove_Pairing {
    public int solution(String s) {
        int answer = -1;

        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(!stack.isEmpty() && stack.peek().equals(s.charAt(i)))
                stack.pop();
            else
                stack.push(s.charAt(i));
        }

        return stack.isEmpty() ? 1 : 0;
    }
}
