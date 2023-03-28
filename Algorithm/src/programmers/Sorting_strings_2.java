package programmers;

import java.util.Arrays;

public class Sorting_strings_2 {

    public String solution(String my_string) {
        String answer = "";

        String str = my_string.toLowerCase();

        char[] arr = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        Arrays.sort(arr);
        for (char c : arr)
            answer += c;

        return answer;
    }
}
