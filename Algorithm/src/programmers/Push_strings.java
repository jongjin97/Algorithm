package programmers;

public class Push_strings {

    public int solution(String A, String B) {
        int answer = 0;
        if(A.equals(B))
            return 0;
        for(int i=1; i<A.length(); i++){
            A = push(A);

            if(A.equals(B))
                return i;
        }

        return -1;
    }

    public String push(String A){
        String str = "";

        str += A.substring(A.length()-1);
        str += A.substring(0, 1);

        return str;
    }
}
