package baekjoon;

import java.io.*;
import java.util.LinkedList;
//약수들의 합
public class sum_of_divisors_9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true){
            int n = Integer.parseInt(br.readLine());
            if(n == -1)
                break;
            int sum = 0;
            LinkedList<Integer> list = new LinkedList<>();
            for(int i=1; i<n; i++){
                if(n % i == 0){
                    sum+=i;
                    list.add(i);
                }
            }
            if(sum != n){
                bw.write(n + " is NOT perfect.");
                bw.newLine();
            } else {
                bw.write(n + " = ");
                for(int j=0; j<list.size(); j++){
                    if(j == list.size()-1){
                        bw.write(String.valueOf(list.get(j)));
                    } else {
                        bw.write(list.get(j) + " + ");
                    }
                }
                bw.newLine();
            }
        }
        bw.flush();
    }
}
