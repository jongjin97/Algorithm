package baekjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Safe_Zone_2468 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] map = new int[N][N];
        boolean[][] check = new boolean[N][N];
        int max = 0;
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(max, map[i][j]);
            }
        }
        int result = 0;
        for(int a=0; a<max; a++){
            int cnt = 0;
            check = new boolean[N][N];
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    if(map[i][j] > a && !check[i][j]){
                        Queue<int[]> queue = new LinkedList<>();
                        queue.add(new int[] {i, j});
                        check[i][j] = true;
                        cnt++;

                        while(!queue.isEmpty()){
                            int[] tmp = queue.poll();

                            if(tmp[0] + 1 < N && !check[tmp[0]+1][tmp[1]] && map[tmp[0]+1][tmp[1]] > a){
                                queue.add(new int[] {tmp[0] + 1, tmp[1]});
                                check[tmp[0]+1][tmp[1]] = true;
                            }
                            if(tmp[1] + 1 < N && !check[tmp[0]][tmp[1]+1] && map[tmp[0]][tmp[1]+1] > a){
                                queue.add(new int[] {tmp[0], tmp[1] + 1});
                                check[tmp[0]][tmp[1]+1] = true;
                            }
                            if(tmp[0] -1 >= 0 && !check[tmp[0]-1][tmp[1]] && map[tmp[0]-1][tmp[1]] > a){
                                queue.add(new int[] {tmp[0]-1, tmp[1]});
                                check[tmp[0]-1][tmp[1]] = true;
                            }
                            if(tmp[1] -1 >= 0 && !check[tmp[0]][tmp[1]-1] && map[tmp[0]][tmp[1]-1] > a){
                                queue.add(new int[] {tmp[0], tmp[1] -1});
                                check[tmp[0]][tmp[1]-1] = true;
                            }
                        }
                    }
                }
            }
            result = Math.max(result, cnt);

        }
        System.out.println(result);
    }
}
