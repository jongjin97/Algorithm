package baekjoon;

import java.io.*;

public class Sum_of_Numbers_1789 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long S = Long.parseLong(br.readLine());
        long cur = 0;
        long result = 1;
        while(cur < S){
            cur += result+1;
            result++;
        }
        bw.write(String.valueOf(result-1));
        bw.flush();
    }
}
