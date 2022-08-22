package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Treasure_1026 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        Integer[] B = new Integer[N];

        String[] str = br.readLine().split(" ");
        String[] str2 = br.readLine().split(" ");
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(str[i]);
            B[i] = Integer.parseInt(str2[i]);
        }

        Arrays.sort(A);
        Arrays.sort(B, Collections.reverseOrder());

        int result = 0;
        for(int i=0; i<N; i++){
            result += A[i] * B[i];
        }
        System.out.println(result);
    }
}
