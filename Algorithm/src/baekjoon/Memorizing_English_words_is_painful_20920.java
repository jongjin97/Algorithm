package baekjoon;

import java.io.*;
import java.util.*;
//영단어 암기는 괴로워
public class Memorizing_English_words_is_painful_20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        List<String> list = new LinkedList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<N; i++){
            String a = br.readLine();
            if(a.length() >= K){
                if(!map.containsKey(a)){
                    list.add(a);
                }
                map.put(a, map.getOrDefault(a, 0) + 1);
            }
        }


        list.sort((o1, o2) -> {
            if (!Objects.equals(map.get(o1), map.get(o2))) {
                return map.get(o2) - map.get(o1);
            } else if (Objects.equals(map.get(o1), map.get(o2)) && o1.length() != o2.length()) {
                return o2.length() - o1.length();
            }
            return o1.compareTo(o2);
        });

        for(String s : list){
            bw.write(s+"\n");
        }
        bw.flush();
    }
}
