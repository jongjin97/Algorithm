package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class scale_2920 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] num = new int[8];
        for(int i=0; i<num.length; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        if(asc(num))
            bw.write("ascending");
        else if(des(num))
            bw.write("descending");
        else
            bw.write("mixed");
        bw.flush();

    }
    public static boolean asc(int[] num){
        for(int i=0; i<num.length; i++){
            if(num[i] != i+1)
                return false;
        }
        return true;
    }

    public static boolean des(int[] num){
        for(int i=0; i<num.length; i++){
            if(num[i] != 8-i)
                return false;
        }
        return true;
    }
}
