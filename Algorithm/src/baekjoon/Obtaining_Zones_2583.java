package baekjoon;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Obtaining_Zones_2583 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int M = Integer.parseInt(str[0]);
        int N = Integer.parseInt(str[1]);
        int K = Integer.parseInt(str[2]);
        int[][] map = new int[M+1][N+1];

        for(int i=0; i<K; i++){
            str = br.readLine().split(" ");
            int x1 = Integer.parseInt(str[0]);
            int y1 = Integer.parseInt(str[1]);
            int x2 = Integer.parseInt(str[2]);
            int y2 = Integer.parseInt(str[3]);

            for(int j = y1; j<y2; j++){
                for(int k = x1; k<x2; k++){
                    map[j][k] = 1;
                }
            }
        }
        for(int i=0; i<=M; i++){
            for(int j=0; j<=N; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        Queue<int[]> queue = new LinkedList();
        List<Integer> list = new ArrayList<>();
        int cnt = 0;
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                int size = 0;
                if(map[i][j] == 0){
                    cnt++;
                    queue.add(new int[] {i, j});
                    map[i][j] = 1;
                    while (!queue.isEmpty()){
                        int[] tmp = queue.poll();
                        size++;
                        if(tmp[0]-1 >= 0 && map[tmp[0]-1][tmp[1]] == 0){
                            queue.add(new int[] {tmp[0]-1, tmp[1]});
                            map[tmp[0]-1][tmp[1]] = 1;
                        }
                        if(tmp[0]+1<M && map[tmp[0]+1][tmp[1]] == 0) {
                            queue.add(new int[]{tmp[0] + 1, tmp[1]});
                            map[tmp[0]+1][tmp[1]] = 1;
                        }
                        if(tmp[1]-1>=0 && map[tmp[0]][tmp[1]-1] == 0) {
                            queue.add(new int[]{tmp[0], tmp[1] - 1});
                            map[tmp[0]][tmp[1]-1] = 1;
                        }
                        if(tmp[1]+1<N && map[tmp[0]][tmp[1]+1] == 0) {
                            queue.add(new int[]{tmp[0], tmp[1] + 1});
                            map[tmp[0]][tmp[1]+1] = 1;
                        }
                    }
                    list.add(size);
                }
            }
        }
        bw.write(String.valueOf(cnt));
        bw.newLine();
        Stream intStream = list.stream().sorted();
        intStream.forEach(o -> {
            try {
                bw.write(String.valueOf(o) + " ");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        bw.flush();
    }
}
