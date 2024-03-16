package baekjoon;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;
//덱 2
public class Deque_2_28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            if(num == 1){
                deque.addFirst(Integer.valueOf(st.nextToken()));
            } else if(num == 2){
                deque.addLast(Integer.valueOf(st.nextToken()));
            } else if(num == 3){
                if(deque.isEmpty()){
                    bw.write("-1");
                    bw.newLine();
                } else {
                    bw.write(String.valueOf(deque.pollFirst()));
                    bw.newLine();
                }
            } else if(num == 4){
                if(deque.isEmpty()){
                    bw.write("-1");
                    bw.newLine();
                } else {
                    bw.write(String.valueOf(deque.pollLast()));
                    bw.newLine();
                }
            } else if(num == 5){
                bw.write(String.valueOf(deque.size()));
                bw.newLine();
            } else if(num == 6){
                if(deque.isEmpty()){
                    bw.write("1");
                    bw.newLine();
                } else {
                    bw.write("0");
                    bw.newLine();
                }
            } else if(num == 7){
                if(deque.isEmpty()){
                    bw.write("-1");
                    bw.newLine();
                }else{
                    bw.write(String.valueOf(deque.peekFirst()));
                    bw.newLine();
                }
            } else if(num == 8){
                if(deque.isEmpty()){
                    bw.write("-1");
                    bw.newLine();
                }else{
                    bw.write(String.valueOf(deque.peekLast()));
                    bw.newLine();
                }
            }
        }
        bw.flush();
    }
}
