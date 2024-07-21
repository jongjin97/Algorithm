package baekjoon;

import java.util.Scanner;
//격자상의 경로
public class path_on_grid_10164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        int cnt = 0;
        int x = 0;
        int y = 0;

        int[][] map = new int[N+1][M+1];
        int[][] map2 = new int[N+1][M+1];

        for(int i=1; i<=N; i++){
            for(int j=1; j<=M; j++){
                cnt++;
                if(cnt == K){
                    x = j;
                    y = i;
                }
                if(i==1 && j==1) {
                    map[i][j] = 1;
                    continue;
                }
                map[i][j] = map[i-1][j] + map[i][j-1];
            }
        }

        if(K == 0){
            System.out.println(map[N][M]);
        } else {
            for(int i=y; i<=N; i++){
                for(int j=x; j<=M; j++){
                    if(i==y && j==x) {
                        map2[i][j] = 1;
                        continue;
                    }
                    map2[i][j] = map2[i-1][j] + map2[i][j-1];
                }
            }

            System.out.println(map[y][x] * map2[N][M]);
        }
    }
}
