package baekjoon;

import java.io.*;
//피보나치 수 6
public class Fibonacci_number_11444 {
    static long[][] origin = {{1,1},{1,0}};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long N = Long.parseLong(br.readLine());

        long[][] map = {{1,1}, {1,0}};

        long[][] result = func(map, N);
        if(N == 0){
            System.out.println("0");
            return;
        }
        System.out.println(result[1][0]%1000000007);
    }

    public static long[][] func(long[][] map, long N){
        if (N <= 1) {
            return map;
        }
        long[][] next = func(map, N/2);
        next = multiple(next, next);
        if(N%2 == 1){
            next = multiple(origin, next);
        }
        return next;
    }

    public static long[][] multiple(long[][] a, long[][] b){
        long[][] result = new long[2][2];
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                for(int k=0; k<2; k++){
                    result[i][j] += (a[i][k] * b[k][j])%1000000007;
                }
            }
        }
        return result;
    }
}
