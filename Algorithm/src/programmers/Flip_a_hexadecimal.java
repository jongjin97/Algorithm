package programmers;

public class Flip_a_hexadecimal {

    public int solution(int n) {
        int answer = 0;
        String hex = hex(n);
        answer = decimal(hex);

        return answer;
    }
    public int decimal(String hex){
        long num = Long.parseLong(hex);
        long cnt = 0;
        int result = 0;
        while(num != 0){
            result += Math.pow(3, cnt) * (num%10);
            cnt++;
            num/=10;
        }

        return result;
    }

    public String hex(long n){
        String s = "";
        while(n != 0){
            s += n%3;
            n/=3;
        }
        return s;
    }
}
