package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum_of_numbers_2_2003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        int[] arr = new int[N];
        int sum = 0;
        int count = 0;
        str = br.readLine().split(" ");
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        for(int i=0; i<N; i++){
            sum = 0;
            for(int j=i; j<N; j++){
                sum += arr[j];
                if(sum == M)
                    count++;
            }
        }
        System.out.println(count);
        br.close();
    }
}
