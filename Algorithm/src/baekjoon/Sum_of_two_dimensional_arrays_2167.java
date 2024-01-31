package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Sum_of_two_dimensional_arrays_2167 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] map = new int[N+1][M+1];
        for(int i=1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=M; j++){
                map[i][j] = Integer.parseInt(st.nextToken()) + map[i][j-1];
            }
        }

        int K = Integer.parseInt(br.readLine());

        for(int a=0; a<K; a++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int sum1 = 0;
            for(int b=i; b<=x; b++){
                if(j == y)
                    sum1 += map[b][y] - map[b][y-1];
                else
                    sum1 += map[b][y] - map[b][j-1];
            }
            bw.write(String.valueOf(sum1));
            bw.newLine();
        }
        bw.flush();
    }
}
