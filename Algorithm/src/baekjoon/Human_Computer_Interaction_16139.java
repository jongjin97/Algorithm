package baekjoon;

import java.io.*;
import java.util.StringTokenizer;
//인간-컴퓨터 상호작용
public class Human_Computer_Interaction_16139 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //a = 97, z = 122
        String str = br.readLine();
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[26][str.length()];
        for(int i=0; i<= 122-97; i++){
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j) == 97+i){
                    arr[i][j] = arr[i][Math.max(j-1, 0)] + 1;
                } else {
                    arr[i][j] = arr[i][Math.max(j-1, 0)];
                }
            }
        }

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            char a = st.nextToken().charAt(0);
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int sum = arr[a-97][c];
            if(b != 0){
                sum -= arr[a-97][Math.max(0, b-1)];
            }
            bw.write(sum + "");
            bw.newLine();
        }
        bw.flush();
    }
}
