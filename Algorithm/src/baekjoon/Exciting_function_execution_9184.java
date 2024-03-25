package baekjoon;

import java.io.*;
import java.util.StringTokenizer;
// 신나는 함수 실행
public class Exciting_function_execution_9184 {
    static int[][][] map = new int[51][51][51];;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a == -1 && b == -1 && c == -1)
                break;
            //map = new int[51][51][51];
            bw.write("w("+a+", " + b + ", " + c + ") = " + func(a, b, c));
            bw.newLine();
        }
        bw.flush();
    }
    public static int func(int a, int b, int c){
        if(a <= 0 || b<= 0 || c <= 0)
            return 1;
        if(a > 20 || b > 20 || c > 20) {
            if(map[20][20][20] == 0)
                map[20][20][20] = func(20, 20, 20);
            return map[20][20][20];
        }
        if(a < b && b < c) {
            if(map[a][b][c-1] == 0){
                map[a][b][c-1] = func(a,b, c-1);
            }
            if(map[a][b-1][c-1] == 0){
                map[a][b-1][c-1] = func(a, b-1, c-1);
            }
            if(map[a][b-1][c] == 0){
                map[a][b-1][c] = func(a, b-1, c);
            }
            return  map[a][b][c-1] + map[a][b-1][c-1] -  map[a][b-1][c];
        }
        if(map[a-1][b][c] == 0){
            map[a-1][b][c] = func(a-1, b, c);
        }
        if(map[a-1][b-1][c] == 0){
            map[a-1][b-1][c] = func(a-1, b-1, c);
        }
        map[a-1][b][c-1] = map[a-1][b][c-1] == 0 ? func(a-1,b,c-1) : map[a-1][b][c-1];
        map[a-1][b-1][c-1] = map[a-1][b-1][c-1] == 0 ? func(a-1,b-1,c-1) : map[a-1][b-1][c-1];
        return map[a-1][b][c] + map[a-1][b-1][c] + map[a-1][b][c-1] - map[a-1][b-1][c-1];
    }
}
