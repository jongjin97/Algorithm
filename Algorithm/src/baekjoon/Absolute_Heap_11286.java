package baekjoon;

import java.io.*;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Absolute_Heap_11286 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>((o1, o2) -> {
            if(Math.abs(o1) == Math.abs(o2)){
                return o1 > o2 ? 1 : -1;
            } else {
                return Math.abs(o1) - Math.abs(o2);
            }
        });
        for(int i=0; i<size; i++){
            int tmp = Integer.parseInt(br.readLine());

            if(tmp == 0)
                if(queue.isEmpty())
                    bw.write("0\n");
                else
                    bw.write(queue.poll()+"\n");
            else
                queue.add(tmp);

        }
        bw.flush();

    }
}
