package programmers;

import java.util.Arrays;

public class Numerical_pairings {

    public String solution(String X, String Y) {
        String answer = "";
        int[] cnt = new int[10];
        StringBuilder stringBuilder = new StringBuilder();

        for(int i=0; i<Y.length(); i++){
            cnt[Integer.parseInt(String.valueOf(Y.charAt(i)))]++;
        }
        String[] arr = X.split("");
        Arrays.sort(arr);
        for(int i=X.length()-1; i>=0; i--){
            int tmp = Integer.parseInt(arr[i]);
            if(cnt[tmp] > 0) {
                cnt[tmp]--;

                stringBuilder.append(tmp);
            }
        }
        answer = stringBuilder.toString();
        if(answer.startsWith("0"))
            answer = "0";
        return answer.equals("") ? "-1" : answer;
    }
}
