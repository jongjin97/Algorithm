package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Travel_Routes {
    ArrayList<ArrayList<String>> arrayList = new ArrayList<>();
    public String[] solution(String[][] tickets) {
        String[] answer = {};
        boolean[] check = new boolean[tickets.length];
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("ICN");
        rec(tickets,check, "ICN", 0, arrayList);

        int cnt = 0;
        boolean[] bool = new boolean[this.arrayList.size()];
        for(int i=0; i<this.arrayList.size(); i++){
            if(bool[i])
                continue;
            for(int j=i+1; j<this.arrayList.size(); j++){
                if(bool[j])
                    continue;
                for(int k=1; k<tickets.length+1; k++){
                    if(this.arrayList.get(i).get(k).compareTo(this.arrayList.get(j).get(k)) < 0){
                        cnt = i;
                        bool[j] = true;
                        break;
                    } else if(this.arrayList.get(i).get(k).compareTo(this.arrayList.get(j).get(k)) > 0){
                        cnt = j;
                        bool[i] = true;
                        break;
                    }
                }
            }
        }
//        for(int i=0; i<this.arrayList.size()-1; i++){
//            for(int j=0; j<=tickets.length; j++){
//                if(this.arrayList.get(i).get(j).compareTo(this.arrayList.get(i+1).get(j)) > 0){
//                    System.out.println(this.arrayList.get(i).get(j)
//                            + " " + this.arrayList.get(i+1).get(j) + " " + this.arrayList.get(i).get(j).compareTo(this.arrayList.get(i+1).get(j)));
//                    cnt = i +1;
//                    break;
//                }
//            }
//        }

        answer = this.arrayList.get(cnt).toArray(new String[0]);
        return answer;
    }

    public void rec(String[][] tickets, boolean[] check, String curr, int cnt, ArrayList list){
        if(list.size() == tickets.length+1){
            System.out.println("ok");
            System.out.println(list);
            arrayList.add((ArrayList<String>) list.clone());
        }
        System.out.println(list);
        for(int i=0; i<tickets.length; i++){
            if(!check[i] && tickets[i][0].equals(curr)){
                check[i] = true;
                list.add(tickets[i][1]);
                rec(tickets, check, tickets[i][1], cnt + 1, list);
                check[i] = false;
//                list.remove(tickets[i][1]);
                list.remove(list.size()-1);
            }
        }
    }
}
