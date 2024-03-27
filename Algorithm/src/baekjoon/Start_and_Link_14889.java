package baekjoon;

import java.io.*;
import java.util.StringTokenizer;
//스타트와 링크
public class Start_and_Link_14889 {
    static int result = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] map = new int[N][N];
        boolean[] check = new boolean[N];
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        func(map, 0, check, 0);
        System.out.println(result);
    }

    public static void func(int[][] map, int cnt, boolean[] check, int index){
        if(cnt == map.length/2){
            func_B(check, map);
            return;
        }
        for(int i=index; i<check.length; i++){
            check[i] = true;
            func(map, cnt + 1, check, i + 1);
            check[i] = false;
        }
    }

    public static void func_B(boolean[] check, int[][] map){
        int sum = 0;
        for(int i=0; i<check.length; i++){
            if(check[i]){
                for(int j=i+1; j<check.length; j++){
                    if(check[j]) {
                        sum += map[i][j];
                        sum += map[j][i];
                    }
                }
            }
        }
        int sum2 = 0;
        for(int i=0; i<check.length; i++){
            if(!check[i]){
                for(int j=i+1; j<check.length; j++){
                    if(!check[j]) {
                        sum2 += map[i][j];
                        sum2 += map[j][i];
                    }
                }
            }
        }
        result = Math.min(result, Math.abs(sum- sum2));
    }
}
