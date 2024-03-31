package baekjoon;

import java.io.*;
//쿼드트리
public class QuadTree_1992 {
    static BufferedWriter bw;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[][] map = new int[N][N];
        for(int i=0; i<N; i++){
            String[] str = br.readLine().split("");
            for(int j=0; j<N; j++){
                map[i][j] = Integer.parseInt(str[j]);
            }
        }
        func(N, map, 0, 0);
        bw.flush();

    }
    //1100001010001
    //1100101001010001
    public static void func(int N, int[][] map, int x, int y) throws IOException {
        int num = func(x, y, map, N);
        if(num == 1){
            bw.write("1");
            return;
        } else if(num == 0){
            bw.write("0");
            return;
        }
        if(N == 2){

            bw.write("("+String.valueOf(map[y][x])+String.valueOf(map[y][x+1])
                    +String.valueOf(map[y+1][x])+String.valueOf(map[y+1][x+1]) +")");
            return;
        }
        bw.write("(");
        func(N/2, map, x,y);
        func(N/2, map, x+N/2,y);
        func(N/2, map, x,y+N/2);
        func(N/2, map, x+N/2,y+N/2);
        bw.write(")");
    }

    public static int func(int x, int y, int[][] map, int N){
        boolean check0 = false;
        boolean check1 = false;
        for(int i=y; i<= y+N-1; i++){
            for(int j=x; j<=x+N-1; j++){
                if(check0 && check1)
                    return -1;
                if(map[i][j] == 0)
                    check0 = true;
                else if(map[i][j] == 1)
                    check1 = true;
            }
        }
        if(check0 && check1)
            return -1;
        else if(check0)
            return 0;
        else
            return 1;
    }
}
