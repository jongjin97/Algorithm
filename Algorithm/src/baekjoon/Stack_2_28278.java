package baekjoon;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;
//스택 2
public class Stack_2_28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            if(a == 1){
                stack.add(Integer.valueOf(st.nextToken()));
            } else if(a == 2){
                if(stack.isEmpty()){
                    bw.write("-1\n");
                } else {
                    bw.write(String.valueOf(stack.pop()));
                    bw.newLine();
                }
            } else if(a == 3){
                bw.write(String.valueOf(stack.size()));
                bw.newLine();
            } else if(a == 4){
                if(stack.isEmpty()){
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else if(a == 5){
                if(stack.isEmpty()){
                    bw.write("-1\n");
                } else {
                    bw.write(String.valueOf(stack.peek()));
                    bw.newLine();
                }
            }

        }
        bw.flush();
    }
}
