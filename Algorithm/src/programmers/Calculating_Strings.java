package programmers;

public class Calculating_Strings {

    public int solution(String my_string) {
        int answer = 0;

        String[] str = my_string.split(" ");

        if(!str[0].equals("-") || !str[0].equals("+"))
            answer = Integer.parseInt(str[1]);
        for(int i=0; i<str.length; i++){
            if(str[i].equals("+")){
                answer += Integer.parseInt(str[i+1]);
            } else if(str[i].equals("-")){
                answer -= Integer.parseInt(str[i+1]);
            }
        }

        return answer;
    }
}
