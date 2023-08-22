package programmers;

public class The_longest_Palindrome {

    public int solution(String s) {
        int answer = 0;

        for(int i = 0; i < s.length(); i++) {
            // 길이가 홀수인 팰린드롬 검사
            int len1 = checkPalindrome(s, i, i);
            answer = Math.max(answer, len1);

            // 길이가 짝수인 팰린드롬 검사
            int len2 = checkPalindrome(s, i, i + 1);
            answer = Math.max(answer, len2);
        }

        return answer;
    }

    private int checkPalindrome(String s, int left, int right) {
        int len = 0;

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            len = right - left + 1;
            left--;
            right++;
        }

        return len;
    }
}
