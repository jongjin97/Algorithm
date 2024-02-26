package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class The_Little_Prince_1004 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String[] str = br.readLine().split(" ");
            int x1 = Integer.parseInt(str[0]);
            int y1 = Integer.parseInt(str[1]);
            int x2 = Integer.parseInt(str[2]);
            int y2 = Integer.parseInt(str[3]);
            int n = Integer.parseInt(br.readLine());
            System.out.println(count(x1, y1, x2, y2, n));
        }
    }
    public static int count(int x1, int y1, int x2, int y2, int n) throws IOException {
        int count = 0;
        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);
            int r = Integer.parseInt(str[2]);
            if ((Math.pow(x - x1, 2) + Math.pow(y - y1, 2)) < Math.pow(r, 2) && (Math.pow(x - x2, 2) + Math.pow(y - y2, 2)) < Math.pow(r, 2)) {
                continue;
            }
            if ((Math.pow(x - x1, 2) + Math.pow(y - y1, 2)) < Math.pow(r, 2) || (Math.pow(x - x2, 2) + Math.pow(y - y2, 2)) < Math.pow(r, 2)) {
                count++;
            }
        }
        return count;
    }
}
