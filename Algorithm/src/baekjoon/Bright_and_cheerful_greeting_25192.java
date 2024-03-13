package baekjoon;

import java.io.*;
import java.util.HashSet;
//인사성 밝은 곰곰이
public class Bright_and_cheerful_greeting_25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();
        int res = 0;
        for(int i=0; i<N; i++){
            String s = br.readLine();
            if(!s.equals("ENTER")){
                set.add(s);
            } else {
                res += set.size();
                set = new HashSet<>();
            }
        }
        res += set.size();
        bw.write(String.valueOf(res));
        bw.flush();
    }
}
