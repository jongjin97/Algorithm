package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Find_Number_1920 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] num1 = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            num1[i] = Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        int[] num2 = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            num2[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(num1);
        br.close();

        for(int i=0; i<M; i++){
            int lo = 0;
            int hi = N-1;
            int mid = (lo+hi)/2;

            while(true){
                if(num2[i] == num1[mid] || num2[i] == num1[lo] || num2[i] == num1[hi]){
                    bw.write("1");
                    bw.newLine();
                    break;
                } else if(lo+1 == hi){
                    bw.write("0");
                    bw.newLine();
                    break;
                }
                if(num2[i] > num1[mid]){
                    lo = mid;
                    mid = (lo+hi)/2;
                } else if (num2[i] < num1[mid]){
                    hi = mid;
                    mid = (lo+hi)/2;
                }
            }
        }
        bw.flush();
        bw.close();

    }
}
