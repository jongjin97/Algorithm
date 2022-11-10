package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class N_and_M_4_15652 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[M+1];
        arr[0] = 1;
        dfs(N, 1, arr);
    }

    public static void dfs(int N, int cnt, int[] arr){
        if(cnt == arr.length){
            for(int i=1; i<arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i=arr[cnt-1]; i<=N; i++){
            arr[cnt] = i;
            dfs(N, cnt + 1, arr);
            arr[cnt] = 0;

        }
    }
}
