package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Sum_of_GCD_9613 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int test = Integer.parseInt(br.readLine());

        for(int t=0; t<test; t++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            long sum = 0;
            int n = Integer.parseInt(st.nextToken());
            int[] num = new int[n];
            for(int i=0; i<n; i++){
                num[i] = Integer.parseInt(st.nextToken());
            }

            for(int i=0; i<n; i++){
                for(int j=i+1; j<n; j++){
                    sum += rec(num[i], num[j]);
                }
            }
            bw.write(String.valueOf(sum));
            bw.newLine();
        }
        bw.flush();
    }

    public static int rec(int a, int b){
        int num1 = Math.max(a, b);
        int num2 = Math.min(a, b);
        if(num2 == 0)
            return num1;

        if(num2 != 0){
            return rec(num2, num1%num2);
        }
        return 0;
    }
}
