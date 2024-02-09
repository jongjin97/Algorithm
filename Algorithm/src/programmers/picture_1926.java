package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class picture_1926 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][m];
        boolean[][] visit = new boolean[n][m];
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        int cnt = 0;
        int extent = 0;


        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(!visit[i][j] && map[i][j] != 0){
                    cnt ++;
                    queue.add(new int[] {i,j});
                    visit[i][j] = true;
                    int tmp = 1;
                    extent = Math.max(extent, tmp);
                    while (!queue.isEmpty()){
                        int[] curr = queue.poll();

                        for(int k=0; k<4; k++){
                            int x = curr[1] + dx[k];
                            int y = curr[0] + dy[k];
                            if(x >= 0 && y >= 0 && x < m && y < n){
                                if(!visit[y][x] && map[y][x] != 0){
                                    visit[y][x] = true;
                                    map[y][x] = ++tmp;
                                    extent = Math.max(extent, map[y][x]);
                                    queue.add(new int[] {y, x});
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
        System.out.println(extent);


    }
}
