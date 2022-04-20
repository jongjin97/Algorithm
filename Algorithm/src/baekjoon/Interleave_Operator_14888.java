package baekjoon;

import java.util.Scanner;

public class Interleave_Operator_14888 {
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        int[] oper = new int[4];
        int[] use = new int[4];
        int size = 0;
        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<4; i++){
            oper[i] = sc.nextInt();
            size += oper[i];
        }

        dfs(arr, oper, arr[0], use, size+1, 1);
        System.out.println(max);
        System.out.println(min);
    }

    public static void dfs(int[] arr, int[] oper, int sum, int[] use, int size, int cnt){
        if(cnt == size){
            max = max > sum ? max : sum;
            min = min < sum ? min : sum;
            return;
        }
        if(oper[0] > use[0]) {
            use[0] += 1;
            dfs(arr, oper, sum + arr[cnt], use, size, cnt + 1);
            use[0] -= 1;
        }
        if(oper[1] > use[1]) {
            use[1] += 1;
            dfs(arr, oper, sum - arr[cnt], use, size, cnt + 1);
            use[1] -= 1;
        }
        if(oper[2] > use[2]) {
            use[2] += 1;
            dfs(arr, oper, sum * arr[cnt], use, size, cnt + 1);
            use[2] -= 1;
        }
        if(oper[3] > use[3]) {
            use[3] += 1;
            dfs(arr, oper, sum / arr[cnt], use, size, cnt + 1);
            use[3] -= 1;
        }
    }
}
