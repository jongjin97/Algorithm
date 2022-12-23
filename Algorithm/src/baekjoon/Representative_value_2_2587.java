package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Representative_value_2_2587 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] num = new int[5];
        int sum = 0;
        for(int i=0; i<5; i++){
            num[i] = Integer.parseInt(br.readLine());
            sum+= num[i];
        }
        Arrays.sort(num);
        bw.write(String.valueOf(sum/5));
        bw.newLine();
        bw.write(String.valueOf(num[2]));
        bw.flush();
    }
}
