package programmers;

public class Find_prime_numbers {

    public int solution(int n) {
        int answer = 0;

        for(int i=2; i<=n; i++){
            if(prime(n))
                answer++;
        }
        return answer;
    }

    public static boolean prime(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }
}
