package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Lope_2217 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        arr = Arrays.stream(arr).sorted().toArray();

        int max = 0;
        for(int i=0; i<N; i++){
            int cnt = 1;
            for(int j=i+1; j<N; j++){
                if(arr[i] > arr[j])
                    continue;
                cnt++;
            }
            max = Math.max(max, arr[i]*cnt);
        }

        System.out.println(max);
    }
}
