package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Alphabet_1987 {
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static int result = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        boolean[] check = new boolean[91];
        String[][] map = new String[R][C];
        for(int i=0; i<R; i++){
            String[] str = br.readLine().split("");
            for(int j=0; j<C; j++){
                map[i][j] = str[j];
            }
        }


        check[map[0][0].charAt(0)] = true;
        rec(0,0, check, map, 1);
        System.out.println(result);
    }

    public static void rec(int x, int y, boolean[] check, String[][] map, int cnt){
        result = Math.max(result, cnt);

        for(int i=0; i<4; i++){
            int a = x + dx[i];
            int b = y + dy[i];
            if(a >= 0 && a < map.length && b >= 0 && b < map[0].length){
                if(!check[map[a][b].charAt(0)]){
                    check[map[a][b].charAt(0)] = true;
                    rec(a,b, check, map, cnt + 1);
                    check[map[a][b].charAt(0)] = false;
                }
            }
        }
    }
}
