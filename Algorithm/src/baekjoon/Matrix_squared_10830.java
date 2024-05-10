package baekjoon;

import java.io.*;
import java.util.StringTokenizer;
//행렬 제곱
public class Matrix_squared_10830 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        int[][] mat = new int[N][N];
        int[][] result = new int[N][N];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                mat[i][j] = Integer.parseInt(st.nextToken())%1000;
                result[i][j] = mat[i][j];
            }
        }
        result = func(mat, result, B);

        for(int i=0; i<result.length; i++){
            for(int j=0; j<result.length; j++){
                bw.write(result[i][j] + " ");
            }
            bw.newLine();
        }
        bw.flush();

    }
    public static int[][] func(int[][] mat, int[][] result, long B){
        if(B <= 1L){
            return result;
        }
        int[][] res = func(mat, result, B/2);
        res = func_2(res, res);
        if(B%2 == 1L){
            res = func_2(mat, res);
        }
        return res;
    }
    // a^10 = a^2^5 = (a^2)^2)^2*a
    public static int[][] func_2(int[][] mat, int[][] result){
        int[][] res = new int[mat.length][mat.length];
        for(int i=0; i<result.length; i++){
            for(int j=0; j<result.length; j++){
                int sum = 0;
                for(int k=0; k<result.length; k++){
                    sum += mat[i][k] * result[k][j]%1000;
                }
                res[i][j] = sum%1000;
            }
        }

        return res;
    }
}
