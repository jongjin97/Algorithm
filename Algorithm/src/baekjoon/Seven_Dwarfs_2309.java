package baekjoon;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Seven_Dwarfs_2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for(int i=0; i<9; i++){
            arr[i] = sc.nextInt();
        }
        int a = 0;
        int b= 0;
        for(int i=0; i<9; i++){
            for(int j=i+1; j<9; j++){
                int sum =0;
                for(int k=0; k<9; k++){
                    if(k == i || k == j){

                    } else {
                        sum += arr[k];
                    }
                }
                if(sum == 100){
                    a = i;
                    b = j;
                }
            }
        }
        ArrayList<Integer> array = new ArrayList<>();
        for(int i=0; i<9; i++){
            if(i != a && i != b){
                array.add(arr[i]);
            }
        }
        Collections.sort(array);
        for(int i : array)
            System.out.println(i);

    }
}
