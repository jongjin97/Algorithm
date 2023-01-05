package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Statistics_2108 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] num = new int[N];

        for(int i=0; i<N; i++){
            num[i] = sc.nextInt();
        }

        Arrays.sort(num);

        System.out.println(getMean(num));
        System.out.println(getMedian(num));
        System.out.println(getMode(num));
        System.out.println(getScope(num));
    }
    public static int getScope(int[] num){
        return num[num.length-1] - num[0];
    }

    public static int getMedian(int[] num){
        return num[num.length/2];
    }

    public static int getMode (int[] num){
        int[] mode = new int[8001];
        int max = 0;
        int maxIndex = 0;
        for(int i=0; i<num.length; i++){
            mode[num[i]+4000]++;
        }
        for(int i=0; i<mode.length; i++){
            if(max < mode[i]){
                max = mode[i];
                maxIndex = i;
            }
        }
        for(int i=0; i<mode.length; i++){
            if(max == mode[i] && maxIndex != i){
                maxIndex = i;
                break;
            }
        }
        return maxIndex - 4000;
    }

    public static int getMean(int[] num){
        int sum = 0;
        for(int i=0; i<num.length; i++){
            sum += num[i];
        }
        return (int)Math.round((double)sum/num.length);
    }
}
