package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class parallelogram_1064 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[][] pos = new int[4][2];
        for (int i = 0; i < 3; i++) {
            pos[i][0] = Integer.parseInt(st.nextToken());
            pos[i][1] = Integer.parseInt(st.nextToken());
        }
        double tmp4 = (double) (pos[0][0] - (pos[1][0])) / (pos[0][1]  - (pos[1][1]));
        double tmp5 = (double) (pos[1][0]  - (pos[2][0])) / (pos[1][1]  - (pos[2][1]));
        double tmp6 = (double) (pos[2][0]  - (pos[0][0])) / (pos[2][1] - (pos[0][1]));
        if (tmp4 == tmp5 && tmp5 == tmp6) {
            System.out.printf("-1.0");
            return;
        }
        if (pos[0][0] == pos[1][0] && pos[1][0] == pos[2][0]) {
            System.out.printf("-1.0");
            return;
        }
        if (pos[0][1] == pos[1][1] && pos[1][1] == pos[2][1]) {
            System.out.printf("-1.0");
            return;
        }


        double a = Math.sqrt(Math.pow(pos[0][0] - pos[1][0], 2) + Math.pow(pos[0][1] - pos[1][1], 2));
        double b = Math.sqrt(Math.pow(pos[0][0] - pos[2][0], 2) + Math.pow(pos[0][1] - pos[2][1], 2));
        double c = Math.sqrt(Math.pow(pos[2][0] - pos[1][0], 2) + Math.pow(pos[2][1] - pos[1][1], 2));

        double max = Math.max(a * 2 + b * 2, Math.max(a * 2 + c * 2, b * 2 + c * 2));
        double min = Math.min(a * 2 + b * 2, Math.min(a * 2 + c * 2, b * 2 + c * 2));

        System.out.printf(String.valueOf(max - min));

    }
}
