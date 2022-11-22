package baekjoon;

import java.io.*;
import java.util.*;

public class Research_institute_14502 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,-1,1};
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] map = new int[N][M];
        ArrayList<int[]> list = new ArrayList();
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == 2){
                    int[] tmp = {i, j};
                    list.add(tmp);
                }
            }
        }
        int max = N*M;
        int result = 0;

        for(int i=0; i<max; i++){
            if(map[i/M][i%M] != 0)
                continue;
            map[i/M][i%M] = 1;
            for(int j=i+1; j<max; j++){
                if(map[j/M][j%M] != 0)
                    continue;
                map[j/M][j%M] = 1;
                for(int k=j+1; k<max; k++){
                    if(map[k/M][k%M] != 0 )
                        continue;
                    map[k/M][k%M] = 1;
                    boolean[][] check = new boolean[N][M];
                    int[][] clone = new int[N][M];
                    for(int t=0; t<N; t++)
                        clone[t] = Arrays.copyOfRange(map[t], 0, map[t].length);
                    for(int x=0; x<list.size(); x++){
                        int[] tmp = list.get(x);
                        clone[tmp[0]][tmp[1]] = 2;
                        Queue<int[]> q = new LinkedList();
                        q.add(tmp);
                        check[tmp[0]][tmp[1]] = true;
                        while (!q.isEmpty()){
                            int[] qt = q.poll();
                            for(int n=0; n<4; n++){
                                int ax = qt[0] + dx[n];
                                int ay = qt[1] + dy[n];
                                if(ax >= 0 && ax <N && ay >=0 && ay<M){
                                    if(!check[ax][ay] && clone[ax][ay] == 0) {
                                        q.add(new int[]{ax, ay});
                                        check[ax][ay] = true;
                                        clone[ax][ay] = 2;
                                    }
                                }
                            }
                        }
                    }
                    int cnt = 0;
                    for(int a=0; a<N; a++){
                        for(int b=0; b<M; b++){
                            if(clone[a][b] == 0)
                                cnt++;
                        }
                    }
                    result = Math.max(result, cnt);
                    map[k/M][k%M] = 0;
                }
                map[j/M][j%M] = 0;
            }
            map[i/M][i%M] = 0;
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}
