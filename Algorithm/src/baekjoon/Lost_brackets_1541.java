package baekjoon;

import java.util.Scanner;

public class Lost_brackets_1541 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String[] arr = str.split("-");
        int result;
        for(int i=0; i<arr.length; i++){
            String[] arr2 = arr[i].split("\\+");
            int sum = 0;
            for(int j=0; j<arr2.length; j++){
                sum += Integer.parseInt(arr2[j]);
            }
            arr[i] = String.valueOf(sum);
        }
        result = Integer.parseInt(arr[0]);
        for(int i=1; i<arr.length; i++){
            result -= Integer.parseInt(arr[i]);
        }
        System.out.println(result);
    }
}
