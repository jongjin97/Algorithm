package baekjoon;

import java.io.*;
//세로읽기
public class Vertical_reading_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = new String[5];
        int size = 0;
        for(int i=0; i<5; i++){
            str[i] = br.readLine();
            size = Math.max(size, str[i].length());
        }
        for(int i=0; i<size; i++){
            for(int j=0; j<5; j++){
                if(str[j].length() > i){
                    bw.write(str[j].charAt(i));
                }
            }
        }

        bw.flush();
    }
}
