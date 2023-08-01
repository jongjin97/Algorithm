package programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Convert_numbers {
//숫자 변환하기
    public int solution(int x, int y, int n) {
        int answer = 0;

        int[] arr = new int[1000001];
        Arrays.fill(arr, Integer.MAX_VALUE);
        Queue<Integer> queue = new LinkedList();
        arr[x] = 0;
        queue.add(x);
        while(!queue.isEmpty()){
            int num = queue.poll();

            if(num+n <= y) {
                if (num + n <= y && arr[num + n] > arr[num] + 1) {
                    queue.add(num + n);
                    arr[num + n] = arr[num] + 1;
                }
            }
            if(num*2 <= y) {
                if (num * 2 <= y && arr[num * 2] > arr[num] + 1) {
                    queue.add(num * 2);
                    arr[num * 2] = arr[num] + 1;
                }
            }
            if(num*3 <= y) {
                if (num * 3 <= y && arr[num * 3] > arr[num] + 1) {
                    queue.add(num * 3);
                    arr[num * 3] = arr[num] + 1;
                }
            }
        }
        return arr[y] != Integer.MAX_VALUE ? arr[y] : -1;
    }
}
