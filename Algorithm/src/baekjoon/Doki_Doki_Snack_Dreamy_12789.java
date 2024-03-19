package baekjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
//도키도키 간식드리미
public class Doki_Doki_Snack_Dreamy_12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<N; i++){
            queue.add(Integer.valueOf(st.nextToken()));
        }
        int index = 1;

        while (!queue.isEmpty() || !stack.isEmpty()){
            if(!queue.isEmpty() && queue.peek() == index){
                queue.poll();
                index++;
            }else if(!stack.isEmpty() && stack.peek() == index){
                stack.pop();
                index++;
            } else if (queue.isEmpty() && stack.peek() != index) {
                break;
            } else {
                stack.add(queue.poll());
            }
        }

        if(queue.isEmpty() && stack.isEmpty()){
            bw.write("Nice");
        } else {
            bw.write("Sad");
        }
        bw.flush();

    }
}
