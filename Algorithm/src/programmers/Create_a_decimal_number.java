package programmers;

public class Create_a_decimal_number {

    public int solution(int[] nums) {
        int result = 0;

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    if(prime(nums[i] + nums[j] + nums[k]))
                        result++;
                }
            }
        }

        return result;
    }


    public boolean prime(int sum){
        for(int i=2; i<=Math.sqrt(sum); i++){
            if(sum%i == 0)
                return false;
        }
        return true;
    }
}
