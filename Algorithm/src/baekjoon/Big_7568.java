package baekjoon;

import java.io.*;

public class Big_7568 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] weight = new int[N];
        int[] height = new int[N];
        int[] result = new int[N];

        for(int i=0; i<N; i++){
            String[] str = br.readLine().split(" ");
            weight[i] = Integer.parseInt(str[0]);
            height[i] = Integer.parseInt(str[1]);
        }

        for(int i=0; i<N; i++){
            int cnt =  1;

            for(int j=0; j<N; j++){
                if(weight[i] < weight[j] && height[i] < height[j]){
                    cnt++;
                }
            }
            result[i] = cnt;
        }

        for(int i : result)
            bw.write(String.valueOf(i) + " ");

        bw.flush();
    }
}
