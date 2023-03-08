package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Sort_cards_1715 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        PriorityQueue<Integer> queue = new PriorityQueue();
        Arrays.stream(arr).forEach(queue::add);

        int sum = 0;
        while(queue.size() > 1) {
            int temp = queue.poll();
            int temp2 = queue.poll();
            int num = temp + temp2;
            sum += num;
            queue.add(num);
        }
        bw.write(sum + "\n");
        bw.flush();
    }

}
