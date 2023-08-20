package programmers;

public class Repeat_binary_conversions {
    public int[] solution(String s) {
        int[] answer = {};

        int cnt = 0;
        int tmp = 0;
        while(!s.equals("1")){
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == '0')
                    cnt++;
            }
            tmp++;
            s = s.replaceAll("0", "");
            s = toBinary(s.length());
        }
        System.out.println(cnt + " " + tmp);
        return new int[] {tmp, cnt};
    }

    public String toBinary(int num){
        StringBuilder stringBuilder = new StringBuilder();
        while(num != 0){
            stringBuilder.append(num%2);
            num/=2;
        }
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}