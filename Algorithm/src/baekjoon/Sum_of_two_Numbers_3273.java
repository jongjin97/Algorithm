package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Sum_of_two_Numbers_3273 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        String[] str = br.readLine().split(" ");
        int x = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            num[i] = Integer.parseInt(str[i]);
        }

        num = Arrays.stream(num).sorted().toArray();

        int left = 0;
        int right = n-1;

        int result = 0;
        while (left < right){
            if(num[left] + num[right] == x)
                result++;

            if(num[left] + num[right] <= x)
                left++;
            else
                right--;
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}
