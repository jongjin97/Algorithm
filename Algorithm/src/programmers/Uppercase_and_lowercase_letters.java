package programmers;

import java.util.Arrays;
import java.util.Locale;

public class Uppercase_and_lowercase_letters {

    public String solution(String my_string) {
        String answer = "";

        String[] str = my_string.split("");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            char[] c = str[i].toCharArray();
            if(Character.isLowerCase(c[0]))
                stringBuilder.append(Character.toUpperCase(c[0]));
            else
                stringBuilder.append(Character.toLowerCase(c[0]));
        }
        answer = stringBuilder.toString();
        return answer;
    }
}
