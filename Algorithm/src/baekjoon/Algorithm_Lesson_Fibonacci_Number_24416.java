package baekjoon;

import java.io.*;
//알고리즘 수업 - 피보나치 수 1
public class Algorithm_Lesson_Fibonacci_Number_24416 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        bw.write(fib(N) + " " + String.valueOf(N-2));
        bw.flush();
    }
    public static int fib(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

    public static int fibonacci(int n){
        int[] arr = new int[n+1];
        arr[1] = 1;
        arr[2] = 1;

        for(int i=3; i<=n; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }
}
