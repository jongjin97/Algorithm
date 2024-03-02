package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Find_the_surface_area_16931 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] map = new int[N+2][M+2];
        int[][] result = new int[N+2][M+2];
        for(int i=1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=1; i<=N; i++){
            for(int j=1; j<=M; j++){
                result[i][j] += Math.max((map[i][j] - map[i][j-1]), 0);
            }
        }
        for(int i=1; i<=N; i++){
            for(int j=M; j>=1; j--){
                result[i][j] += Math.max((map[i][j] - map[i][j+1]), 0);
            }
        }
        for(int i=1; i<=M; i++){
            for(int j=1; j<=N; j++){
                result[j][i] += Math.max((map[j][i] - map[j-1][i]), 0);
            }
        }
        for(int i=1; i<=M; i++){
            for(int j=N; j>=1; j--){
                result[j][i] += Math.max((map[j][i] - map[j+1][i]), 0);
            }
        }
        int sum = 0;
        for(int[] i : result){
            for(int j : i){
                sum += j;
            }
        }
        System.out.printf(String.valueOf(sum + N*M*2));
    }
}
