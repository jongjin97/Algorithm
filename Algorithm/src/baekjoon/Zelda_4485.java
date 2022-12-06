package baekjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Zelda_4485 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = 1;
        while(true){
            int N = Integer.parseInt(br.readLine());

            if(N == 0)
                break;
            int[][] map = new int[N][N];
            int[][] dist = new int[N][N];
            boolean[][] check = new boolean[N][N];

            for(int i=0; i<N; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j=0; j<N; j++){
                    map[i][j] = Integer.parseInt(st.nextToken());
                    dist[i][j] = Integer.MAX_VALUE;
                }
            }
            int[] dx = {1, -1, 0, 0};
            int[] dy = {0, 0 , 1, -1};

            Queue<int[]> queue = new LinkedList();
            queue.add(new int[] {0, 0});
            dist[0][0] = map[0][0];
            check[0][0] = true;

            while (!queue.isEmpty()){
                int[] curr = queue.poll();
                int a = curr[0];
                int b = curr[1];

                for(int i=0; i<4; i++){
                    int x = a + dx[i];
                    int y = b + dy[i];
                    if(x>=0 && x<N && y>=0 && y<N){
                        if(dist[x][y] > dist[a][b] + map[x][y]){
                            dist[x][y] = dist[a][b] + map[x][y];
                            queue.add(new int[] {x, y});
                            check[x][y] = true;
                        }
                    }
                }

            }

            bw.write("Problem " + cnt + ": " + dist[N-1][N-1] + "\n");
            cnt++;
        }
        bw.flush();
    }
}
