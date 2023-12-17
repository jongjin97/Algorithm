package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class The_Josephus_Problem_1158 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<=N; i++){
            queue.add(i);
        }
        int cnt = 1;
        Queue<Integer> result = new LinkedList<>();
        while(!queue.isEmpty()){
            int num = queue.poll();
            if(cnt == K){
                result.add(num);
                cnt = 1;
            } else {
                queue.add(num);
                cnt ++;
            }
        }
        System.out.print("<");
        for(int i=0; i<N; i++){
            System.out.print(result.poll());
            if(result.size() > 0){
                System.out.print(", ");
            }
        }
        System.out.print(">");
    }
}
