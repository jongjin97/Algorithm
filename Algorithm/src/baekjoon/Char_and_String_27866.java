package baekjoon;

import java.util.Scanner;

public class Char_and_String_27866 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int index = sc.nextInt();
        System.out.println(str.charAt(index - 1));
    }
}
