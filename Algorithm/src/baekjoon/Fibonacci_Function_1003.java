package baekjoon;

import java.io.*;

public class Fibonacci_Function_1003 {
    static int[] check = new int[2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        check = new int[2];

        int num = Integer.parseInt(br.readLine());

        for(int i=0; i<num; i++){
            int tmp = Integer.parseInt(br.readLine());
            check = new int[2];
            fibonacci(tmp);
            bw.write(check[0] + " " + check[1] + "\n");
        }
        bw.flush();

    }

    public static void fibonacci(int n) {
        int tmp = 0;
        int tmp0 = 0;
        int tmp1 = 1;
        if (n == 0) {
            check[0]++;
            return ;
        } else if (n == 1) {
            check[1]++;
            return;
        } else {
            for(int i=1; i<n; i++){
                tmp = tmp0 + tmp1;
                tmp0 = tmp1;
                tmp1 = tmp;
            }
            check[0] = tmp0;
            check[1] = tmp1;
        }
    }
}
