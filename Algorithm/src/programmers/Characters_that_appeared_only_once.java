package programmers;

public class Characters_that_appeared_only_once {

    public String solution(String s) {
        String answer = "";

        char[] chars = new char[26];
        char character = 'a';

        for (int i = 0; i < chars.length; i++) {
            chars[i] = character;
            character++;
        }
        int[] cnt = new int[26];
        for(int i=0; i<s.length(); i++){
            cnt[s.charAt(i)-97]++;
        }

        for (int i = 0; i < cnt.length; i++) {
            if(cnt[i] == 1)
                answer += Character.toString('a'+i);
        }


        return answer;
    }
}
