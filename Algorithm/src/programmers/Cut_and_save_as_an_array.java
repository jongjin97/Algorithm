package programmers;

public class Cut_and_save_as_an_array {

    public String[] solution(String my_str, int n) {
        String[] answer;

        if(my_str.length()%n == 0)
            answer = new String[my_str.length()/n];
        else
            answer = new String[my_str.length()/n + 1];

        for(int i=0; i<answer.length; i++){
            answer[i] = my_str.substring(i*n, Math.min(my_str.length(), i*n+n));
        }

        return answer;
    }
}
