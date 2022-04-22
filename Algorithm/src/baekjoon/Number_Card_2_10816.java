package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Number_Card_2_10816 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer, Integer> map = new HashMap<>();

        int N = Integer.parseInt(br.readLine());
        int[] num1 = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(st.nextToken());
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] num2 = new int[M];
        for(int i=0; i<M; i++){
            num2[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        for(int i=0; i<M; i++){
            if(map.containsKey(num2[i])){
                bw.write(map.get(num2[i]) + " ");
            } else {
                bw.write("0 ");
            }
        }


        bw.flush();
        bw.close();
    }
}
