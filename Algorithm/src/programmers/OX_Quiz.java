package programmers;

import java.util.Stack;

public class OX_Quiz {

    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];


        Stack<String> stack = new Stack<>();

        for (int i = 0; i < quiz.length; i++) {
            String[] str = quiz[i].split(" ");
            int num1 = Integer.parseInt(str[0]);
            int num2 = Integer.parseInt(str[2]);
            int num3 = Integer.parseInt(str[4]);

            if(str[1].equals("+")){
                if(num1 + num2 == num3)
                    stack.push("O");
                else
                    stack.push("X");
            }
            else if(str[1].equals("-")){
                if(num1 - num2 == num3)
                    stack.push("O");
                else
                    stack.push("X");
            }
            else if(str[1].equals("*")){
                if(num1 * num2 == num3)
                    stack.push("O");
                else
                    stack.push("X");
            }
            else if(str[1].equals("/")){
                if(num1 / num2 == num3)
                    stack.push("O");
                else
                    stack.push("X");
            }
            answer[i] = stack.pop();
        }



        return answer;
    }
}
