package programmers;

import java.util.Arrays;
import java.util.HashMap;

public class Picking_tangerines {

    public int solution(int k, int[] tangerine) {
        int answer = 0;

        int[] arr = new int[10000001];

        for(int i=0; i<tangerine.length; i++){
            arr[tangerine[i]] += 1;
        }
        Arrays.sort(arr);

        for(int i= arr.length-1; i>=0; i--){
            if(k-arr[i] > 0){
                answer++;
                k-=arr[i];
            }
            else
                break;
        }

        return answer+1;
    }
}
