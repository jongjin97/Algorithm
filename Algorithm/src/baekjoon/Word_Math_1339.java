package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 단어 수학
public class Word_Math_1339 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] alpha = new int[26];
        String[] words = new String[N];
        for(int i=0; i<N; i++){
            words[i] = br.readLine();
        }
        // 알파벳 숫자로 변경
        for(int i=0; i<N; i++){
            for(int j=0; j<words[i].length(); j++){
                alpha[words[i].charAt(j)-'A'] += (int)Math.pow(10, words[i].length()-j-1);
            }
        }
        // 정렬
        for(int i=0; i<26; i++){
            for(int j=i+1; j<26; j++){
                if(alpha[i] < alpha[j]){
                    int tmp = alpha[i];
                    alpha[i] = alpha[j];
                    alpha[j] = tmp;
                }
            }
        }
        int sum = 9;
        int answer = 0;
        for(int i=0; i<26; i++){
            answer += alpha[i]*sum;
            sum--;
            if(sum < 0) break; // 숫자가 부족하면 멈춤.
        }
        System.out.println(answer);
        br.close();

    }
}
