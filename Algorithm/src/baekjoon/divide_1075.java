package baekjoon;

import java.util.Scanner;
//나누기
public class divide_1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int F = sc.nextInt();
        String str = N.substring(0, N.length()-2);
        StringBuilder stringBuilder = new StringBuilder(str);
        for(int i=0; i<F; i++){
            stringBuilder.delete(str.length(), stringBuilder.length());
            if(i < 10){
                stringBuilder.append("0");
            }
            stringBuilder.append(i);

            if(Integer.parseInt(stringBuilder.toString())%F == 0){
                System.out.println(stringBuilder.delete(0, str.length()));
                break;
            }
        }

    }
}
