package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Two_Solutuons_2470 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];
        String[] str = br.readLine().split(" ");
        for(int i=0; i<N; i++){
            num[i] = Integer.parseInt(str[i]);
        }

        num = Arrays.stream(num).sorted().toArray();

        int left = 0;
        int right = N-1;
        int differ = Integer.MAX_VALUE;
        int[] result = new int[2];
        while (left < right){
            int tmp = num[left] + num[right];

            if(Math.abs(tmp) < differ){
                differ = Math.abs(tmp);
                result[0] = num[left];
                result[1] = num[right];
            }

            if(Math.abs(num[left]) < Math.abs(num[right]))
                right--;
            else
                left++;
        }
        bw.write(result[0] + " " + result[1]);
        bw.flush();
    }
}
