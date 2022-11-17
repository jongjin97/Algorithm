package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Subtotals_1806 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int[] num = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++){
            num[i] += num[i-1] + Integer.parseInt(st.nextToken());
        }

        int left = 0;
        int right = 1;
        long sum = num[right];
        int result = Integer.MAX_VALUE;
        while(true){
            if(right > N)
                break;
            sum = num[right] - num[left];
            if(sum >= S){
                result = Math.min(result, right - left);
            }
            if(sum <= S){
                right++;
            } else if(sum > S){
                left++;
            }
        }
        if(result == Integer.MAX_VALUE)
            result = 0;

        System.out.println(result);
    }
}
