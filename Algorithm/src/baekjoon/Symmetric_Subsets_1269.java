package baekjoon;

import javax.swing.text.html.HTMLDocument;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;

public class Symmetric_Subsets_1269 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] arr= str.split(" ");

        int x = Integer.parseInt(arr[0]);
        int y = Integer.parseInt(arr[1]);

        HashSet<Integer> Aset = new HashSet<>();
        HashSet<Integer> Bset = new HashSet<>();

        str = br.readLine();
        arr = str.split(" ");
        for(int i=0; i<x; i++){
            Aset.add(Integer.valueOf(arr[i]));
        }

        str = br.readLine();
        arr = str.split(" ");
        for(int i=0; i<y; i++){
            Bset.add(Integer.valueOf(arr[i]));
        }
        int result = 0;

        Iterator tmp = Aset.iterator();
        while(tmp.hasNext()){
            if(Bset.contains(tmp.next())){
                continue;
            }
            result++;
        }
        tmp = Bset.iterator();
        while(tmp.hasNext()){
            if(Aset.contains(tmp.next())){
                continue;
            }
            result++;
        }
        System.out.println(result);
    }
}
