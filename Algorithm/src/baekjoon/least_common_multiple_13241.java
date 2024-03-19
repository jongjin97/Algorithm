package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;
//최소공배수
public class least_common_multiple_13241 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());

        BigInteger n = a.gcd(b);

        System.out.println(a.multiply(b).divide(n));
    }
}
