package programmers;

public class Carpet {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        int a = 0;
        for(int i=3; i<=Math.sqrt(sum); i++){
            if(sum%i == 0) {
                int tmp = sum/i -2;
                int tmp2 = i -2 ;
                if(tmp*tmp2 == yellow)
                    a = i;
                System.out.println(sum/a + " " + a);
            }
        }
        answer[0] = sum/a;
        answer[1] = a;
        return answer;
    }
}
