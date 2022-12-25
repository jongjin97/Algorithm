package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Cutline_25305 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] num = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);
        System.out.println(num[N-K]);
    }
}
