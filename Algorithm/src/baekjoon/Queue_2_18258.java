package baekjoon;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
//큐 2
public class Queue_2_18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Deque<Integer> queue = new LinkedList<>();

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            if(a.equals("push")){
                queue.add(Integer.valueOf(st.nextToken()));
            } else if (a.equals("pop")) {
                if(queue.isEmpty()){
                    bw.write("-1\n");
                } else {
                    bw.write(String.valueOf(queue.poll()));
                    bw.newLine();
                }
            }else if (a.equals("size")) {
                bw.write(String.valueOf(queue.size())+"\n");
            }else if (a.equals("empty")) {
                if(queue.isEmpty()){
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            }else if (a.equals("front")) {
                if(queue.isEmpty()){
                    bw.write("-1\n");
                } else {
                    bw.write(String.valueOf(queue.peek()));
                    bw.newLine();
                }
            }else if (a.equals("back")) {
                if(queue.isEmpty()){
                    bw.write("-1\n");
                } else {
                    bw.write(String.valueOf(queue.peekLast()));
                    bw.newLine();
                }
            }
        }
        bw.flush();
    }
}
