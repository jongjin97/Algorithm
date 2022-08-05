package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Goldbachs_conjecture_6588 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int max = 1000001;
        boolean[] check = new boolean[max];
        for(int i=2; i*i< check.length; i++){

            if(!check[i])
                for(int j=i+i; j< check.length; j+=i)
                    check[j] = true;
        }

        while (true){
            int num = Integer.parseInt(br.readLine());
            boolean find = false;
            if(num == 0){
                bw.flush();
                return;
            }
            for(int i=3; i<=num; i+=2){
                if(!check[i] && !check[num-i]){
                    bw.write(num + " = " + i + " + " + (num-i) + "\n");
                    find = true;
                    break;
                }
            }
            if(!find)
                bw.write("Goldbach's conjecture is wrong.\n");
        }

    }
}
