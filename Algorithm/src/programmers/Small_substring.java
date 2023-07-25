package programmers;

public class Small_substring {

    public int solution(String t, String p) {
        int answer = 0;

        for(int i=0; i<t.length()-p.length()+1; i++){
            String tmp = t.substring(i, i+p.length());
            if(tmp.equals(p)){
                answer++;
                continue;
            }
            for(int j=0; j<tmp.length(); j++){
                char a = tmp.charAt(j);
                char b = p.charAt(j);

                if(a < b) {
                    answer++;
                    break;
                } else if(a > b){
                    break;
                }
            }
        }

        return answer;
    }
}
