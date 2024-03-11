package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//진법 변환
public class base_conversion_2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        int n = Integer.parseInt(st.nextToken());
        //A = 65 0 = 48
        int result = 0;
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) >= 65){
                result+= (int) ((a.charAt(i)-55)*Math.pow(n, a.length()-i-1));
            } else {
                result+= (int) ((a.charAt(i)-48)*Math.pow(n, a.length()-i-1));
            }
        }

        System.out.println(result);
    }
}
