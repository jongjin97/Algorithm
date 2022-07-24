package baekjoon;

import java.io.*;
import java.util.PriorityQueue;

public class Min_Heap_1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue();

        for(int i=0; i<num; i++){
            int tmp = Integer.parseInt(br.readLine());
            if(tmp != 0)
                queue.add(tmp);
            else if(!queue.isEmpty()){
                bw.write(queue.poll().toString());
                bw.newLine();
            } else {
                bw.write(String.valueOf(0));
                bw.newLine();
            }
        }
        bw.flush();
    }
}
