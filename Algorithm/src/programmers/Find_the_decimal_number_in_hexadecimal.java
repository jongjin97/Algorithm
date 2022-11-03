package programmers;

public class Find_the_decimal_number_in_hexadecimal {
    public static void main(String[] args) {
        int n = 437674;
        int k = 3;

        solution(n, k);

        n=110011;
        k=10;
        solution(n,k);
    }

    public static int solution(int n, int k) {
        int answer = 0;

        String str = hexadecimal(n, k);
        String[] arr = str.split("0");
        for(String i : arr) {
            boolean check = false;
            if(!i.equals(""))
                check = find(Long.parseLong(i));
            if(check)
                answer++;
        }
        return answer;
    }
    public static boolean find(long num){
        if(num <= 1)
            return false;
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i == 0)
                return false;
        }
        return true;
    }

    public static String hexadecimal(int n, int k){
        String str = "";
        while(n > 0){
            str += String.valueOf(n%k);
            n /= k;
        }
        String[] tmp = str.split("");
        String result = "";

        for(int i=tmp.length-1; i>=0; i--){
            result += tmp[i];
        }
        return result;
    }
}
