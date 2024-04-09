package baekjoon;

import java.io.*;
//골드바흐 파티션
public class goldbach_partition_17103 {
    static boolean[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0){
            int num = Integer.parseInt(br.readLine());
            arr = new boolean[num+1];
            func(num);
            int res = 0;
            for(int i=2; i<=num/2; i++){
                if(i > num-i)
                    break;
                if(!arr[i] && !arr[num-i]){
                    res++;
                }
            }
            bw.write(String.valueOf(res));
            bw.newLine();
        }
        bw.flush();
    }

    public static void func(int num){
        for(int i=2; i<= Math.sqrt(num); i++){
            if(arr[i])
                continue;
            for(int j=i+i; j<=num; j+=i){
                arr[j] = true;
            }
        }
    }
}
