package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Tree_Cropping_2805 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        int[] num = new int[N];
        int max = 0;
        int min = 0;
        str = br.readLine().split(" ");
        for(int i=0; i<N; i++){
            num[i] = Integer.parseInt(str[i]);
            if(max < num[i])
                max = num[i];
        }
        int mid = 0;
        while (min < max){
            mid = (min+max) / 2;
            long sum = 0;

            for(int i : num)
                if(i >= mid )
                    sum+= i - mid;

            if(sum < M)
                max = mid;
            else
                min = mid+1;
        }

        bw.write(String.valueOf(min-1));
        bw.flush();
    }
}
