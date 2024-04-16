package baekjoon;

import java.io.*;
import java.util.StringTokenizer;
//행렬 덧셈
public class matrix_addition_2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] map1 = new int[N][M];
        int[][] map2 = new int[N][M];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<M; j++){
                map1[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<M; j++){
                map2[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int[][] result = new int[N][M];
        for(int i=0; i<N; i++){
            for (int j=0; j<M; j++){
                result[i][j] = map1[i][j] + map2[i][j];
            }
        }
        for(int i=0; i<N; i++){
            for (int j=0; j<M; j++){
                bw.write(result[i][j] + " ");
            }
            bw.newLine();
        }

        bw.flush();
    }
}
