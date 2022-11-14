package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class A_and_B_12904 {
    static boolean check = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String start = br.readLine();
        String result = br.readLine();

        while(start.length() < result.length()){
            char tmp = result.charAt(result.length()-1);
            if(tmp == 'A')
                result = result.substring(0, result.length()-1);
            else{
                result = result.substring(0, result.length()-1);
                result = new StringBuffer(result).reverse().toString();
            }
        }

        if(start.equals(result))
            bw.write("1");
        else
            bw.write("0");
        bw.flush();
    }
}
