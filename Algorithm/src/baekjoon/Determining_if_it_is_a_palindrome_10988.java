package baekjoon;

import java.util.Scanner;
//팰린드롬인지 확인하기
public class Determining_if_it_is_a_palindrome_10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int start = 0;
        int end = str.length()-1;
        boolean check = true;
        while (start <= end){
            if(str.charAt(start) != str.charAt(end)){
                check = false;
            }
            start++;
            end--;
        }
        if(check)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
