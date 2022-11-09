package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Lotto_6603 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            if(N == 0)
                break;
            int[] num = new int[N];

            for(int i=0; i<N; i++){
                num[i] = Integer.parseInt(st.nextToken());
            }
            int[] arr = new int[6];
            rec(num, 0, arr, 0);
            System.out.println();
        }
    }

    public static void rec(int[] num, int cnt, int[] arr, int index){
        if(index > num.length)
            return;
        if(cnt == 6) {
            for (int i : arr)
                System.out.print(i + " ");
            System.out.println();
            return;
        }

        for(int i=index; i<num.length; i++){
            arr[cnt] = num[i];
            rec(num, cnt+1, arr, i+1);
            arr[cnt] = 0;
        }
    }
}
