package baekjoon;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Deque_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=0; i<n; i++){
            String[] str = br.readLine().split(" ");
            if(str[0].equals("push_front")){
                deque.addFirst(Integer.parseInt(str[1]));
            }else if(str[0].equals("push_back")){
                deque.addLast(Integer.parseInt(str[1]));
            }else if(str[0].equals("pop_front")){
                if(deque.isEmpty())
                    bw.write("-1\n");
                else
                    bw.write(deque.pollFirst() + "\n");
            }else if(str[0].equals("pop_back")){
                if(deque.isEmpty())
                    bw.write("-1\n");
                else
                    bw.write(deque.pollLast() + "\n");
            }else if(str[0].equals("size")){
                bw.write(deque.size() + "\n");
            }else if(str[0].equals("empty")){
                if(deque.isEmpty())
                    bw.write("1\n");
                else
                    bw.write("0\n");
            }else if(str[0].equals("front")){
                if(deque.isEmpty())
                    bw.write("-1\n");
                else
                    bw.write(deque.peekFirst() + "\n");
            }else if(str[0].equals("back")){
                if(deque.isEmpty())
                    bw.write("-1\n");
                else
                    bw.write(deque.peekLast() + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
