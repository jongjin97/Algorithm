package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//랜선 자르기
public class LAN_Trimming_1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int K = Integer.parseInt(str[0]);
        int N = Integer.parseInt(str[1]);

        int[] arr = new int[K];
        long left = 0;
        long right = 0;
        for(int i=0; i<K; i++){
            arr[i] = Integer.parseInt(br.readLine());
            right = Math.max(right, arr[i]);
        }
        long mid = Math.max((right+left)/2,1);

        while(left <= right){
            int cnt = 0;
            for(int i=0; i<K; i++){
                cnt += arr[i]/mid;
            }
            if(cnt == N){
                left = mid + 1;
                mid = Math.max((right+left)/2,1);
            } else if (cnt > N) {
                left = mid + 1;
                mid = Math.max((right+left)/2,1);
            } else {
                right = mid - 1;
                mid = Math.max((right+left)/2,1);
            }
        }
        System.out.println(mid);
    }
}
