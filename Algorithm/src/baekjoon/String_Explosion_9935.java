package baekjoon;

import java.io.StringReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class String_Explosion_9935 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String bomb = sc.next();

        System.out.println(solution(str, bomb));
    }
    public static String solution(String str, String bomb){
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<str.length(); i++){
            stack.push(str.charAt(i));
            if(stack.size() >= bomb.length()){
                boolean flag = true;
                for(int j=0; j<bomb.length(); j++){
                    if(stack.get(stack.size()-bomb.length()+j) != bomb.charAt(j)){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    for(int j=0; j<bomb.length(); j++){
                        stack.pop();
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : stack){
            sb.append(c);
        }
        return sb.toString().length() == 0 ? "FRULA" : sb.toString();
    }
}
