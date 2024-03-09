package baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
//별 찍기 - 7
public class take_a_star_2444 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = sc.nextInt();
        int size = n*2-1;

        for (int i=1; i<n; i++){
            int a = i*2-1;

            int b = (size - a) /2;

            for(int j=0; j<b; j++){
                bw.write(" ");
            }
            for(int j=0; j<a; j++){
                bw.write("*");
            }
            bw.newLine();
        }
        for(int i=0; i<size; i++){
            bw.write("*");
        }
        for (int i=n-1; i>0; i--){
            bw.newLine();
            int a = i*2-1;

            int b = (size - a) /2;

            for(int j=0; j<b; j++){
                bw.write(" ");
            }
            for(int j=0; j<a; j++){
                bw.write("*");
            }
        }

        bw.flush();
    }
}
