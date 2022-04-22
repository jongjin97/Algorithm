package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Red_Green_Color_Weakness_10026 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] dx = {1,-1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        int N = Integer.parseInt(st.nextToken());
        String[][] map = new String[N][N];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            map[i] = st.nextToken().split("");
        }
        boolean[][] check = new boolean[N][N];
        boolean[][] check2 = new boolean[N][N];
        Queue<int[]> queue = new LinkedList<>();
        Queue<int[]> queue2 = new LinkedList<>();


        int cnt = 0;
        int cnt2 = 0;

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(!check[i][j]) {
                    queue.add(new int[] {i, j});
                    check[i][j] = true;
                    cnt++;
                    while (!queue.isEmpty()) {
                        int[] tmp = queue.poll();
                        for (int k = 0; k < 4; k++) {
                            int x = tmp[0] + dx[k];
                            int y = tmp[1] + dy[k];
                            if (x >= 0 && y >= 0 && x < N && y < N) {
                                if (!check[x][y] && map[x][y].equals(map[tmp[0]][tmp[1]])) {
                                    queue.add(new int[] {x,y});
                                    check[x][y] = true;
                                }
                            }
                        }
                    }
                }
                if(!check2[i][j]) {
                    queue2.add(new int[] {i, j});
                    check2[i][j] = true;
                    cnt2++;
                    while (!queue2.isEmpty()) {
                        int[] tmp = queue2.poll();
                        for (int k = 0; k < 4; k++) {
                            int x = tmp[0] + dx[k];
                            int y = tmp[1] + dy[k];
                            if (x >= 0 && y >= 0 && x < N && y < N) {
                                if (!check2[x][y]) {
                                    if(map[tmp[0]][tmp[1]].equals("R")){
                                        if(map[x][y].equals("R") || map[x][y].equals("G")){
                                            queue2.add(new int[] {x,y});
                                            check2[x][y] = true;
                                        }
                                    } else if(map[tmp[0]][tmp[1]].equals("G")){
                                        if(map[x][y].equals("R") || map[x][y].equals("G")){
                                            queue2.add(new int[] {x,y});
                                            check2[x][y] = true;
                                        }
                                    } else if(map[tmp[0]][tmp[1]].equals("B") && map[x][y].equals("B")){
                                        queue2.add(new int[] {x,y});
                                        check2[x][y] = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(cnt + " " + cnt2);
    }
}
