package baekjoon;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Flip_1439 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        AtomicInteger cnt = new AtomicInteger();
        AtomicInteger cnt2 = new AtomicInteger();
        String[] arr = str.split("0");
        String[] arr2 = str.split("1");

        Arrays.stream(arr).forEach(s -> {
            int tmp = 0;
            if(s.length() > 0)
                tmp++;
            cnt.addAndGet(tmp);
        });
        Arrays.stream(arr2).forEach(s -> {
            int tmp = 0;
            if(s.length() > 0)
                tmp++;
            cnt2.addAndGet(tmp);
        });
        System.out.println(Math.min(cnt.get(), cnt2.get()));
    }
}
