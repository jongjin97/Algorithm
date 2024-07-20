package baekjoon;

import java.util.Scanner;
//파스칼의 삼각형
public class pascals_triangle_16395 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[][] map = new int[N+1][N+1];
        map[1][1] = 1;
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                if(i == 1 && j == 1) {
                    map[i][j] = 1;
                    continue;
                }
                map[i][j] = map[i-1][j-1] + map[i-1][j];
            }
        }

        System.out.println(map[N][K]);
    }
}
