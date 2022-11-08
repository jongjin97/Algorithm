package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Electric_wire_2565 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] line = new int[N+1][2];

        for(int i=1; i<=N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            line[i][0] = Integer.parseInt(st.nextToken());
            line[i][1] = Integer.parseInt(st.nextToken());
        }
        int[] dp = new int[N+1];
        Arrays.sort(line, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        dp[0] = 1;
        Arrays.fill(dp, 1);
        for(int i=1; i<=N; i++){
            for(int j=i; j<=N; j++){
                if(line[i][1] < line[j][1]){
                    dp[j] = Math.max(dp[j], dp[i] + 1);
                }
            }
        }

        bw.write(String.valueOf(N - Arrays.stream(dp).max().getAsInt()));
        bw.flush();
        //5
        //1 2
        //2 3
        //3 4
        //4 5
        //5 1

    }
}
