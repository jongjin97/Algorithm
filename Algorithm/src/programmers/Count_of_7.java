package programmers;

public class Count_of_7 {

    public int solution(int[] array) {
        int answer = 0;

        for(int i=0; i<array.length; i++){
            int num = array[i];
            while (num != 0){
                answer = num%10 == 7 ? answer+1 : answer;
                num/=10;
            }
        }

        return answer;
    }
}
