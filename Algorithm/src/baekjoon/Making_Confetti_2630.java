package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Making_Confetti_2630 {
    static int cnt0 = 0;
    static int cnt1 = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[][] map = new int[num][num];
        for(int j=0; j<num; j++){
            String[] str = br.readLine().split(" ");
            for(int i=0; i<num; i++){
                map[j][i] = Integer.parseInt(str[i]);
            }
        }
        func(0,0,num, map);
        System.out.println(cnt0);
        System.out.println(cnt1);
    }

    public static void func(int x, int y, int n, int[][] map){
        boolean one = false;
        boolean zero = false;
        for(int i=y; i<y+n; i++){
                for(int j=x; j<x+n; j++){
                    if(map[i][j] == 0)
                        zero = true;
                    else if(map[i][j] == 1)
                        one = true;
                }
        }

        if(one && zero){
            func(x,y, n/2, map); //ok
            func(x+n/2, y, n/2, map);
            func(x, y+n/2, n/2, map);
            func(x+n/2, y+n/2, n/2, map);
        } else if(one){
            cnt1++;
        } else if(zero){
            cnt0++;
        }


    }
}
