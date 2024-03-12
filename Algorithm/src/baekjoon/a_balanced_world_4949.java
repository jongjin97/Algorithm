package baekjoon;

import java.io.*;
import java.util.Stack;
//균형잡힌 세상
public class a_balanced_world_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){
            String str = br.readLine();
            if(str.equals("."))
                break;
            Stack<Character> stack = new Stack<>();
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i) == '(' || str.charAt(i) == '['){
                    stack.add(str.charAt(i));
                }
                if(str.charAt(i) == ')'){
                    if(stack.isEmpty()){
                        stack.add('s');
                        break;
                    } else if(stack.peek() == '('){
                        stack.pop();
                    } else if(stack.peek() != '('){
                        stack.add('s');
                        break;
                    }
                } else if(str.charAt(i) == ']'){
                    if(stack.isEmpty()){
                        stack.add('s');
                        break;
                    }else if(stack.peek() == '['){
                        stack.pop();
                    } else if(stack.peek() != '['){
                        stack.add('s');
                        break;
                    }
                }
            }

            bw.write(stack.isEmpty() ? "yes\n" : "no\n");
        }

        bw.flush();
    }
}
