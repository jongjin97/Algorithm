package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class DownHill_1520 {
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static int cnt = 0;
    static int[][] map, dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        dp = new int[N][M];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                dp[i][j] = -1;
            }
        }
        br.close();
        bw.write(Integer.toString(dfs(0,0)));
        bw.flush();
        bw.close();
    }

    public static int dfs(int a, int b){
        if(a == map.length-1 && b == map[0].length-1){
            return 1;
        }
        if(dp[a][b] != -1)
            return dp[a][b];
        dp[a][b] = 0;
        for(int i=0; i<4; i++){
            if(a + dx[i] >= 0 &&  a + dx[i] <map.length && b +dy[i] >= 0 && b + dy[i] <map[0].length){
                if(map[a+dx[i]][b+dy[i]] < map[a][b])
                    dp[a][b] += dfs(a + dx[i], b + dy[i]);
            }
        }
        return dp[a][b];
    }
}
