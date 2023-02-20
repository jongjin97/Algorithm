package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Room_assignment_1931 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];

        for(int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(str[0]);
            arr[i][1] = Integer.parseInt(str[1]);
        }

        Arrays.sort(arr, (o1, o2) -> {
            if(o1[1] == o2[1]) {
                return o1[0] - o2[0];
            } else {
                return o1[1] - o2[1];
            }
        });

        int count = 0;
        int end = 0;
        for(int i = 0; i < N; i++) {
            if(arr[i][0] >= end) {
                end = arr[i][1];
                count++;
            }
        }
        System.out.println( count );
    }
}
