package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Obtaining_a_sum_11441 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N+1];
        int[] sum = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=1; i<=N; i++){
            sum[i] = sum[i-1] + num[i];
        }

        int M = Integer.parseInt(br.readLine());
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bw.write(String.valueOf(sum[b] - sum[a-1]));
            bw.newLine();
        }
        bw.flush();
    }
}
