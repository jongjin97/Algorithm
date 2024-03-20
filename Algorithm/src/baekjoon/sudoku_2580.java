package baekjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
//스도쿠
public class sudoku_2580 {
    static List<int[]> list;
    static int[][] result = new int[9][9];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        list = new LinkedList<>();
        int[][] map = new int[9][9];
        for(int i=0; i<9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<9; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == 0)
                    list.add(new int[] {i, j});
            }
        }

        func(map, 0, 0);

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                bw.write(result[i][j] + " ");
            }
            bw.newLine();
        }
        bw.flush();
    }

    public static void func(int[][] map, int index, int cnt) throws IOException {
        if(cnt == list.size()){
            for(int i=0; i<9; i++){
                result[i] = map[i].clone();
            }
            return;
        }


        int[] pos = list.get(index);
        boolean[] check = find_num(map, pos[1], pos[0]);

        int a = 0;
        for(int j=1; j<check.length; j++){
            check = find_num(map, pos[1], pos[0]);
            if(!check[j]){
                map[pos[0]][pos[1]] = j;
                func(map, index + 1, cnt + 1);
                map[pos[0]][pos[1]] = 0;
            }
        }

    }

    public static boolean[] find_num(int[][] map, int x, int y){
        boolean[] check = new boolean[10];
        for(int i=0; i<9; i++){
            check[map[i][x]] = true;
            check[map[y][i]] = true;
        }
        int xPos = x < 3 ? 0 : x < 6 ? 3 : 6;
        int yPos = y < 3 ? 0 : y < 6 ? 3 : 6;

        for(int i=yPos; i<yPos+3; i++){
            for(int j=xPos; j<xPos+3; j++){
                check[map[i][j]] = true;
            }
        }
        return check;
    }
}
