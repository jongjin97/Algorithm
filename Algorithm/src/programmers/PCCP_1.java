package programmers;

public class PCCP_1 {

    public String solution(String input_string) {
        String answer = "";
        //a = 97
        char[] arr =  input_string.toCharArray();
        int[] alpha = new int[26];
        alpha[arr[arr.length-1]-97]++;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] != arr[i+1]){
                alpha[arr[i]-97]++;
            }
        }

        for(int i=0; i<alpha.length; i++){
            if(alpha[i] >= 2){
                answer +=  (char)(i+97);
            }
        }

        return answer == "" ? "N" : answer;
    }
}
