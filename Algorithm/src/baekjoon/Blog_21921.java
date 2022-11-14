package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Blog_21921 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] num = new int[n];
        for(int i=0; i<n; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 1;
        int sum = Arrays.stream(Arrays.copyOfRange(num, 0, k)).sum();
        int max = sum;
        for(int i=1; i<=n-k; i++){
            sum -= num[i-1];
            sum += num[i+k-1];

            if(max < sum){
                max = sum;
                cnt = 1;
            } else if(max == sum)
                cnt++;
        }

        if(max == 0)
            bw.write("SAD");
        else{
            bw.write(max + "\n" + cnt);
        }
        bw.flush();

    }
}
