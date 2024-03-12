package baekjoon;

import java.io.*;
import java.util.StringTokenizer;
//진법 변환 2
public class base_conversion_11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        for(int i=N; i>0; i/=B){
            int a = i%B;
            String s = Character.toString('A' + (a-10));
            if(a >= 10){
                stringBuilder.insert(0, s);
            } else {
                stringBuilder.insert(0, a);

            }
        }
        System.out.println(stringBuilder.toString());
    }
}
