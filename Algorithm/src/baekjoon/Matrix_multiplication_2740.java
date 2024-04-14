package baekjoon;

import java.io.*;
import java.util.StringTokenizer;
//행렬 곱셈
public class Matrix_multiplication_2740 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] A = new int[N][M];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        st = new StringTokenizer(br.readLine());
        int O = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int[][] B = new int[O][P];
        for(int i=0; i<O; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<P; j++){
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int[][] result = new int[N][P];

        for(int i=0; i<N; i++){
            for(int j=0; j<P; j++){
                int num = 0;
                for(int k=0; k<M; k++){
                    num += A[i][k] * B[k][j];
                }
                result[i][j] = num;
                bw.write(result[i][j] + " ");
            }
            bw.newLine();
        }

        bw.flush();
    }
}
