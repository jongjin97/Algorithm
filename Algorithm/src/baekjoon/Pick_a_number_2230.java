package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
//수 고르기
public class Pick_a_number_2230 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        int[] arr = new int[N];
        int min = Integer.MAX_VALUE;

        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for(int i=0; i<N-1; i++) {
            int low = arr[i];

            for(int j=i+1; j<N; j++) {
                int high = arr[j];
                int leng = high - low;
                if(leng>=M) {
                    min = Math.min(min, leng);
                    break;
                }
            }
        }

        System.out.println(min);
    }
}
