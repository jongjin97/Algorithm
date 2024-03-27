package baekjoon;

import java.io.*;
import java.util.StringTokenizer;
//안녕
public class hi_1535 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] health = new int[N];
        int[] pleasure = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<health.length; i++){
            health[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<pleasure.length; i++){
            pleasure[i] = Integer.parseInt(st.nextToken());
        }
        int[] dp = new int[101];
        for(int i=0; i<N; i++){
            for(int j=100; j>=0; j--){
                if(j-health[i] > 0 )
                   dp[j] = Math.max(dp[j], dp[j-health[i]] + pleasure[i]);
            }
        }

        System.out.println(dp[100]);
    }
}
