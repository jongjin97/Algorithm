package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.StringTokenizer;

//회사에 있는 사람
public class person_in_the_company_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        HashSet<String> hashSet = new HashSet<>();

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name =  st.nextToken();
            String cmd = st.nextToken();
            if(cmd.equals("enter")){
                hashSet.add(name);
            } else {
                hashSet.remove(name);
            }
        }
        String[] arr = hashSet.toArray(new String[0]);
        Arrays.sort(arr, Comparator.reverseOrder());
        for(String s : arr){
            bw.write(s);
            bw.newLine();
        }
        bw.flush();
    }
}
