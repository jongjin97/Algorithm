package baekjoon;

import java.io.*;

//창문 닫기
public class Close_window_13909 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        System.out.println((int)Math.sqrt(N));
    }
}
