package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Hearing_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        HashSet<String> result = new HashSet<>();
        HashSet<String> set1 = new HashSet<>();

        for(int i=0; i<N; i++){
            set1.add(br.readLine());
        }
        for(int i=0; i<M; i++){
            String string = br.readLine();
            if(set1.contains(string))
                result.add(string);
        }

        Stream<String> rest = result.stream().collect(Collectors.toList()).stream().sorted();

//        rest.sort((o1, o2) -> {
//            char[] char1 = o1.toCharArray();
//            char[] char2 = o2.toCharArray();
//
//            return char1[0] - char2[0];
//        });

        String[] r = result.toArray(new String[0]);
        Arrays.sort(r);
        System.out.println(r.length);
        for(String s : r)
            System.out.println(s);

    }
}
