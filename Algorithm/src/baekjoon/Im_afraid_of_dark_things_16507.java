package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Im_afraid_of_dark_things_16507 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        long[][] map = new long[r+1][c+1];
        long[][] sum = new long[r+1][c+1];
        for(int i=1; i<=r; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=c; j++){
                long tmp = Long.parseLong(st.nextToken());
                map[i][j] += map[i][j-1] + tmp;
                sum[i][j] = sum[i-1][j] + map[i][j-1] + tmp;
            }
        }
        for(int i=0; i<q; i++){
            st = new StringTokenizer(br.readLine());
            int r1 = Integer.parseInt(st.nextToken());
            int c1 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            int c2 = Integer.parseInt(st.nextToken());

            long tmp = sum[r2][c2] - sum[r1-1][c2] - sum[r2][c1-1] + sum[r1-1][c1-1];
            int div = (r2-r1+1)*(c2-c1+1);
            bw.write(String.valueOf(tmp/div));
            bw.newLine();
        }
        bw.flush();

    }
}
