package baekjoon;

import java.util.Scanner;

public class Leave_14501 {
    static int max = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] day = new int[num];
        int[] price = new int[num];

        for(int i=0; i<num; i++){
            day[i] = sc.nextInt();
            price[i] = sc.nextInt();
        }
        dfs(day, price, 0, 0);
        System.out.println(max);
    }

    public static void dfs(int[]day, int[]price, int cur, int sum){
        if(cur == price.length) {
            max = max > sum ? max : sum;
            return;
        }

        if(day.length >= cur + day[cur]){
            dfs(day, price, cur + day[cur] , sum + price[cur]);
        }
        dfs(day, price, cur + 1, sum);
    }
}
