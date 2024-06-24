package baekjoon;

import java.io.*;
import java.math.BigInteger;
//다음 소수
public class next_decimal_4134 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            BigInteger bigInteger = new BigInteger(String.valueOf(Math.max(Long.parseLong(br.readLine())-1, 1)));
            bw.write(bigInteger.nextProbablePrime().toString());
            bw.newLine();
        }
        bw.flush();
    }
}
