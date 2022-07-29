package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Hide_and_Seek_3_13549 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] num = new int[300000];

        Queue<Integer> queue = new LinkedList();
        num[N] = 1;
        queue.add(N);
        while(!queue.isEmpty()){
            int tmp = queue.poll();

            if(num[K] != 0)
                break;

            if(tmp*2 < 300000){
                if(num[tmp*2] == 0 || num[tmp*2] > num[tmp]){
                    queue.add(tmp*2);
                    num[tmp*2] = num[tmp];
                }
            }
            if(tmp-1 >= 0){
                if(num[tmp-1] == 0 || num[tmp-1] > num[tmp]+1){
                    queue.add(tmp-1);
                    num[tmp-1] = num[tmp]+1;
                }
            }
            if(tmp+1 < 300000){
                if(num[tmp+1] == 0 || num[tmp+1] > num[tmp]+1){
                    queue.add(tmp+1);
                    num[tmp+1] = num[tmp]+1;
                }
            }
        }

        System.out.println(num[K]-1);
    }
}
