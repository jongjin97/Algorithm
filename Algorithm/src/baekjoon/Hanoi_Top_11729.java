package baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Hanoi_Top_11729 {
    static StringBuilder st = new StringBuilder();
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        hanoi(num, 1, 2, 3);
        st.insert(0, cnt+"\n");
        System.out.println(st);
    }

    public static void hanoi(int num, int start, int mid, int end) throws IOException {
        cnt++;
        if(num == 1){
            st.append(start + " " + end+"\n");
            return;
        }

        hanoi(num-1, start, end, mid);
        st.append(start + " " + end+"\n");
        hanoi(num-1, mid, start, end);
    }
}
