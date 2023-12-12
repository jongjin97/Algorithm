package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Tomato_7569 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int H = Integer.parseInt(stringTokenizer.nextToken());
        int[][] arr = {{0, 1, 0}, {0, -1, 0}, {0, 0, 1}, {0, 0, -1}, {1, 0, 0}, {-1, 0, 0}};
        int[][][] map = new int[H][N][M];
        for(int i=0; i<H; i++){
            for(int j=0; j<map[0].length; j++){
                stringTokenizer = new StringTokenizer(br.readLine());
                for(int k=0; k<map[0][0].length; k++){
                    map[i][j][k] = Integer.parseInt(stringTokenizer.nextToken());
                }
            }
        }
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[0].length; j++){
                for(int k=0; k<map[0][0].length; k++){
                    if(map[i][j][k] == 1){
                        queue.add(new int[] { i, j, k});
                    }
                }
            }
        }
        while (!queue.isEmpty()){
            int[] curr = queue.poll(); // h, n, m

            for(int i=0; i<arr.length; i++){
                int z = curr[0] + arr[i][0];
                int y = curr[1] + arr[i][1];
                int x = curr[2] + arr[i][2];

                if(z>= 0 && z<map.length && y>=0 && y <map[0].length && x>=0 && x < map[0][0].length){
                    if(map[z][y][x] == 0){
                        queue.add(new int[] {z, y, x});
                        map[z][y][x] = map[curr[0]][curr[1]][curr[2]] + 1;
                    }
                }
            }
        }
        int result = 0;
        boolean state = true;
        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[0].length; j++){
                for(int k=0; k<map[0][0].length; k++){
                    result = Math.max(result, map[i][j][k]);
                    if(map[i][j][k] == 0)
                        state = false;
                }
            }
        }
        System.out.println(state ? result-1 : -1);
    }
}
