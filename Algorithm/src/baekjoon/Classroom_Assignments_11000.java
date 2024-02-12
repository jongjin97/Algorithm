package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Classroom_Assignments_11000 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        try {
            n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][2];
            for(int i=0; i<n; i++){
                String[] str = br.readLine().split(" ");
                arr[i][0] = Integer.parseInt(str[0]);
                arr[i][1] = Integer.parseInt(str[1]);
            }
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            Arrays.sort(arr, (o1, o2) -> o1[0] - o2[0]);
            pq.offer(arr[0][1]);
            for(int i=1; i<n; i++){
                   if(arr[i][0] < pq.peek()){
                    pq.offer(arr[i][1]);
                } else {
                    pq.poll();
                    pq.offer(arr[i][1]);
                }
            }
            System.out.println(pq.size());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
