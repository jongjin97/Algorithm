package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Pipe_Moving_1_17070 {
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] map = new int[N][N];
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        rec(map, 0, 1, 1);
        System.out.println(cnt);
    }

    public static void rec(int[][] map, int x, int y, int state){
        if(x == map.length-1 && y == map.length-1){
            cnt++;
            return;
        }

        if(state == 1){
            if(y+1 < map.length)
                if(map[x][y+1] == 0)
                    rec(map, x, y+1, 1);
            if(x+1 < map.length && y+1<map.length)
                if(map[x+1][y+1] == 0 && map[x+1][y] == 0 && map[x][y+1] == 0)
                    rec(map, x+1, y+1, 3);
        } else if(state == 2){
            if(x+1 < map.length)
                if(map[x+1][y] == 0)
                    rec(map, x+1, y, 2);
            if(x+1 < map.length && y+1 < map.length)
                if(map[x+1][y+1] == 0 && map[x+1][y] == 0 && map[x][y+1] == 0)
                    rec(map, x+1, y+1, 3);
        } else if(state == 3){
            if(y+1 < map.length)
                if(map[x][y+1] == 0)
                    rec(map, x, y+1, 1);
            if(x+1 < map.length && y+1<map.length)
                if(map[x+1][y+1] == 0 && map[x+1][y] == 0 && map[x][y+1] == 0)
                    rec(map, x+1, y+1, 3);
            if(x+1<map.length)
                if(map[x+1][y] == 0)
                    rec(map, x+1, y, 2);
        }
    }
}
