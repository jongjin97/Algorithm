package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class hockey_1358 {
    static int W, H, X, Y, P;
    static double R;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = 0;
        W = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());
        R = (double) H /2;
        for(int i=0; i<P; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if(check(x,y))
                result++;
        }
        System.out.printf(String.valueOf(result));

    }

    public static boolean check(int x, int y){
        if(x <= X+W && x>= X && y <= Y+H && y >= Y)
            return true;
        double mid = (double) Y + R;
        double tmp = Math.pow(x-X, 2) + Math.pow(y-mid, 2);
        double tmp2 = Math.pow(x-X-W, 2) + Math.pow(y-mid, 2);
        double radius = Math.pow(R, 2);
        if(Math.pow(x-X, 2) + Math.pow(y-mid, 2) <= Math.pow(R, 2) || Math.pow(x-X-W, 2) + Math.pow(y-mid, 2) <= Math.pow(R, 2))
            return true;


        return false;
    }
}
