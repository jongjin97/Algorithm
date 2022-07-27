package baekjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Printer_Queue_1966 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());

        for(int i=0; i<testCase; i++){
            String[] str = br.readLine().split(" ");
            int N = Integer.parseInt(str[0]);
            int M = Integer.parseInt(str[1]);
            Queue<int[]> queue = new LinkedList<>();
            str = br.readLine().split(" ");
            for(int j=0; j<N; j++){
                queue.add(new int[] {j, Integer.parseInt(str[j])});
            }
            int result = 1;
            while (true){
                int[] tmp = queue.poll();

                if(queue.stream().filter(ints -> ints[1] > tmp[1]).toArray().length != 0) {
                    queue.add(tmp);
                }
                else if(tmp[0] == M) {
                    bw.write(String.valueOf(result));
                    bw.newLine();
                    break;
                } else{
                    result++;
                }
            }
        }
        bw.flush();
    }
}
