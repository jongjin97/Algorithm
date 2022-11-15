package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class Sort_strings_as_you_like {

    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        Arrays.sort(strings);

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.charAt(n) - o2.charAt(n);
            }
        });

        return answer;
    }
}
