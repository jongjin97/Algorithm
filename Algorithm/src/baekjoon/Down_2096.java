package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Down_2096 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[][] num = new int[N+1][3];
        int[][] num2 = new int[N+1][3];
        for(int i=1; i<=N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            num[i][0] = Integer.parseInt(st.nextToken());
            num[i][1] = Integer.parseInt(st.nextToken());
            num[i][2] = Integer.parseInt(st.nextToken());

            num2[i][0] = num[i][0];
            num2[i][1] = num[i][1];
            num2[i][2] = num[i][2];
        }

        for(int i=1; i<=N; i++){
            num[i][0] += Math.max(num[i-1][0], num[i-1][1]);
            num[i][1] += Math.max(num[i-1][0], Math.max(num[i-1][1], num[i-1][2]));
            num[i][2] += Math.max(num[i-1][1], num[i-1][2]);

            num2[i][0] += Math.min(num2[i-1][0], num2[i-1][1]);
            num2[i][1] += Math.min(num2[i-1][0], Math.min(num2[i-1][1], num2[i-1][2]));
            num2[i][2] += Math.min(num2[i-1][1], num2[i-1][2]);
        }

        bw.write(Arrays.stream(num[N]).max().getAsInt() + " " + Arrays.stream(num2[N]).min().getAsInt());
        bw.flush();
    }
}
