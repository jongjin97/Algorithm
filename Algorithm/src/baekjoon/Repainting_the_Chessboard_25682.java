package baekjoon;

import java.io.*;
import java.util.StringTokenizer;
//체스판 다시 칠하기 2
public class Repainting_the_Chessboard_25682 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        char[][] map = new char[N+1][M+1];
        for(int i=1; i<=N; i++){
            String str = br.readLine();
            for(int j=1; j<=M; j++){
                map[i][j] = str.charAt(j-1);
            }
        }

        int[][][] check = new int[2][N+1][M+1];

        for(int i=1; i<=N; i++){
            for(int j=1; j<=M; j++){
                if(i%2 != 0){
                    if(j%2 != 0){
                        // 1,1 B일때
                        if(map[i][j] == 'W'){
                            check[0][i][j] = check[0][i][j-1] + 1;
                        } else {
                            check[0][i][j] = check[0][i][j-1];
                        }
                        // 1,1 W일때
                        if(map[i][j] == 'B'){
                            check[1][i][j] = check[1][i][j-1] + 1;
                        } else {
                            check[1][i][j] = check[1][i][j-1];
                        }
                    } else {
                        // 1,2 B일때
                        if(map[i][j] == 'B'){
                            check[0][i][j] = check[0][i][j-1] + 1;
                        } else {
                            check[0][i][j] = check[0][i][j-1];
                        }
                        // 1,2 W일때
                        if(map[i][j] == 'W'){
                            check[1][i][j] = check[1][i][j-1] + 1;
                        } else {
                            check[1][i][j] = check[1][i][j-1];
                        }
                    }
                } else {
                    if(j%2 != 0){
                        // 1,1 B일때
                        if(map[i][j] == 'B'){
                            check[0][i][j] = check[0][i][j-1] + 1;
                        } else {
                            check[0][i][j] = check[0][i][j-1];
                        }
                        // 1,1 W일때
                        if(map[i][j] == 'W'){
                            check[1][i][j] = check[1][i][j-1] + 1;
                        } else {
                            check[1][i][j] = check[1][i][j-1];
                        }
                    } else {
                        // 1,2 B일때
                        if(map[i][j] == 'W'){
                            check[0][i][j] = check[0][i][j-1] + 1;
                        } else {
                            check[0][i][j] = check[0][i][j-1];
                        }
                        // 1,2 W일때
                        if(map[i][j] == 'B'){
                            check[1][i][j] = check[1][i][j-1] + 1;
                        } else {
                            check[1][i][j] = check[1][i][j-1];
                        }
                    }
                }
            }
        }

        for(int i=1; i<=M; i++){
            for(int j=1; j<=N; j++){
                check[0][j][i] += check[0][j-1][i];
                check[1][j][i] += check[1][j-1][i];
            }
        }

        int result = Integer.MAX_VALUE;
        for(int i=K; i<=N; i++){
            for(int j=K; j<=M; j++){
                result = Math.min(check[0][i][j] - check[0][i-K][j] - check[0][i][j-K] + check[0][i-K][j-K], result);
                result = Math.min(check[1][i][j] - check[1][i-K][j] - check[1][i][j-K] + check[1][i-K][j-K], result);
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
    }
}
