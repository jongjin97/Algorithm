package programmers;

public class Closest_to_the_same_letter {

    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        int[] arr = new int[27];
        // a-97 = 0
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(arr[ch-97] == 0)
                answer[i] = -1;
            else {
                answer[i] = i-arr[ch-97]+1;
            }
            arr[ch-97] = i+1;
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        return answer;
    }
}
