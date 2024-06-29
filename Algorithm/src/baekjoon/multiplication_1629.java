package baekjoon;

import java.io.*;
import java.util.StringTokenizer;
//곱셈
public class multiplication_1629 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());

        long result = func(a, b, c);

        System.out.println(result%c);
    }
    public static long func(long a, long b, long c){
        if(b == 1)
            return a%c;
        long next = a*a%c;
        if(b%2 == 0){
            return func(next, b/2, c)%c;
        } else {
            return (func(next, b/2, c)%c) * (func(a, 1, c)%c);
        }

    }
}
