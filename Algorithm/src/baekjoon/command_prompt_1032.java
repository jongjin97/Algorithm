package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//명령 프롬프트
public class command_prompt_1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = new String[N];
        StringBuilder result = new StringBuilder();
        for(int i=0; i<N; i++){
            str[i] =br.readLine();
        }
        char[][] chars = new char[N][str[0].length()];

        for(int i=0; i<str[0].length(); i++){
            boolean check = true;
            for(int j=0; j<N-1; j++){
                if(str[j].charAt(i) != str[j+1].charAt(i)){
                    check = false;
                }
            }
            if(check){
                result.append(str[0].charAt(i));
            } else {
                result.append("?");
            }
        }
        System.out.println(result.toString());
    }
}
