package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Tomato_7576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int[][] map = new int[Integer.parseInt(str[1])][Integer.parseInt(str[0])];
        Queue<int[]> queue = new LinkedList();
        for(int i=0; i<map.length; i++){
            str = br.readLine().split(" ");
            for(int j=0; j<map[0].length; j++){
                map[i][j] = Integer.parseInt(str[j]);
                if(map[i][j] == 1)
                    queue.add(new int[] {i, j});
            }
        }

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0 ,1, -1};
        while(!queue.isEmpty()){
            int[] curr = queue.poll();

            for(int i=0; i<4; i++){
                int y = curr[0] + dy[i];
                int x = curr[1] + dx[i];
                if(x >= 0 && x < map[0].length && y >= 0 && y < map.length){
                    if(map[y][x] == 0){
                        map[y][x] = map[curr[0]][curr[1]] + 1;
                        queue.add(new int[] { y, x });
                    }
                }
            }
        }
        boolean state = false;
        int max = 0;
        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[0].length; j++){
                if(map[i][j] == 0){
                    state = true;
                }
                max = Math.max(max, map[i][j]);
            }
        }
        System.out.println(!state ? max -1 : -1);
    }
}
