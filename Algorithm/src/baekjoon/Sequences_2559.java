package baekjoon;

import java.io.*;

public class Sequences_2559 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        int[] num = new int[N];
        str = br.readLine().split(" ");
        for(int i=0; i<N; i++){
            num[i] = Integer.parseInt(str[i]);
        }

        int result = Integer.MIN_VALUE;

        for(int i=0; i<=N-K; i++){
            int tmp = 0;
            for(int j=i; j<i+K; j++){
                tmp += num[j];
            }
            result = Math.max(result, tmp);
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}
