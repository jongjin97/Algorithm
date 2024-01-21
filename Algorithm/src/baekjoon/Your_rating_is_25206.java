package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Your_rating_is_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        double sum2 = 0;
        HashMap<String, Double> hashMap = new HashMap<>();
        hashMap.put("A+", 4.5);
        hashMap.put("A0", 4.0);
        hashMap.put("B+", 3.5);
        hashMap.put("B0", 3.0);
        hashMap.put("C+", 2.5);
        hashMap.put("C0", 2.0);
        hashMap.put("D+", 1.5);
        hashMap.put("D0", 1.0);
        hashMap.put("F", 0.0);



        for(int i=0; i<20; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String rating = st.nextToken();

            if(rating.equals("P"))
                continue;
            else if(rating.equals("F")){
                sum += credit;
                sum2 += credit*hashMap.get(rating);
            }
            else {
                sum += credit;
                sum2 += credit*hashMap.get(rating);
            }
        }

        double result = sum2/sum;
        if(sum == 0)
            System.out.println(0.00000);
        else
            System.out.println(result);
    }
}
