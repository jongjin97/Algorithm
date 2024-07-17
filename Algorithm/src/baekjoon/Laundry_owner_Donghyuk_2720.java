package baekjoon;

import java.io.*;

public class Laundry_owner_Donghyuk_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0){
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[4];

            while (N > 0) {
                if(N >= 25){
                    arr[0]++;
                    N-=25;
                } else if(N >= 10){
                    arr[1]++;
                    N-=10;
                } else if(N >= 5){
                    arr[2]++;
                    N-=5;
                } else if(N >= 1){
                    arr[3]++;
                    N-=1;
                }
            }
            for(int i=0; i<4; i++){
                bw.write(arr[i] + " ");
            }
            bw.newLine();
        }
        bw.flush();
    }
}
