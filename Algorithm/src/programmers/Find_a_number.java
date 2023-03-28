package programmers;

public class Find_a_number {

    public int solution(int num, int k) {
        int answer = -1;

        String[] str = String.valueOf(num).split("");
        for (int i = 0; i < str.length; i++) {
            if(str[i].equals(String.valueOf(k)))
                return i+1;
        }

        return answer;
    }
}
