package programmers;

public class A_bunch_of_cards {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int a = 0;
        int b = 0;
        int c = 0;
        while(true){
            if(c == goal.length){
                return "Yes";
            }
            if(a < cards1.length && goal[c].equals(cards1[a])){
                a++;
                c++;
            } else if(b < cards2.length && goal[c].equals(cards2[b])){
                b++;
                c++;
            } else {
                return "No";
            }
        }
    }
}
