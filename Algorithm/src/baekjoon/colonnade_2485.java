package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
//가로수
public class colonnade_2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        for(int i=0; i<N-1; i++){
            arr[i] = Math.abs(arr[i] - arr[i+1]);
        }
        BigInteger a = new BigInteger(String.valueOf(arr[0]));
        BigInteger b = new BigInteger(String.valueOf(arr[1]));

        int gcd = a.gcd(b).intValue();

        for(int i=0; i<N-1; i++){
            gcd = new BigInteger(String.valueOf(arr[i])).gcd(new BigInteger(String.valueOf(gcd))).intValue();
        }
        int result = 0;
        for(int i=0; i<N-1; i++){
            result += arr[i]/gcd - 1;
        }
        System.out.println(result);
    }
}
