package programmers;

public class The_number_that_will_come_next {

    public int solution(int[] common) {
        if(check(common))
            return common[common.length-1] + common[1] - common[0];

        return common[common.length-1] * (common[1] / common[0]);
    }

    //등차수열
    public boolean check(int[] common) {
        int num = common[1] - common[0];
        for(int i=0; i<common.length-1; i++){
            if(common[i] + num != common[i+1])
                return false;
        }
        return true;
    }
}
