package baekjoon;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;
//queuestack
public class queuestack_24511 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int[] cmd = new int[N];
        int[] num = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            cmd[i] = Integer.parseInt(st.nextToken());
        }
        Deque<Integer> deque = new LinkedList<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            num[i] = Integer.parseInt(st.nextToken());
            if(cmd[i] == 0){
                deque.add(num[i]);
            }
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            int C = Integer.parseInt(st.nextToken());

            deque.addFirst(C);

            bw.write(deque.pollLast() + " ");
        }
        bw.flush();
    }
}
