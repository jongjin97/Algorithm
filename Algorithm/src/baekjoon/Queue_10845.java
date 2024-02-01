package baekjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Queue_10845 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        Queue<String> queue = new LinkedList<>();

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            if(cmd.equals("push")){
                queue.add(st.nextToken());
            }
            else if(cmd.equals("front")){
                if(queue.isEmpty()){
                    bw.write("-1");
                    bw.newLine();

                } else {
                    bw.write(queue.peek());
                    bw.newLine();

                }
            }
            else if(cmd.equals("back")){
                if(queue.isEmpty()){
                    bw.write("-1");
                    bw.newLine();

                } else {
                    String[] str = queue.toArray(new String[0]);
                    bw.write(str[str.length-1]);
                    bw.newLine();

                }
            }
            else if(cmd.equals("size")){
                bw.write(String.valueOf(queue.size()));
                bw.newLine();

            }
            else if(cmd.equals("empty")){
                if(queue.isEmpty()){
                    bw.write("1");
                    bw.newLine();

                } else {
                    bw.write("0");
                    bw.newLine();

                }
            }
            else if(cmd.equals("pop")){
                if(queue.isEmpty()){
                    bw.write("-1");
                    bw.newLine();

                } else {
                    bw.write(queue.poll());
                    bw.newLine();

                }
            }
        }
        bw.flush();
    }
}
