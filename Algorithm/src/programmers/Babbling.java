package programmers;

public class Babbling {

    public int solution(String[] babbling) {
        int answer = 0;
        String[] strings = {"aya", "ye", "woo", "ma"};

        for(String s : babbling){
            String tmp = "";
            while(true){
                boolean check = false;
                for(String a : strings){
                    if(s.startsWith(a) && !a.equals(tmp)){
                        s = s.replaceFirst(a, "");
                        tmp = a;
                        check = true;
                    }
                }
                if(!check)
                    break;
            }
            if(s.equals(""))
                answer++;
        }

        return answer;
    }
}
