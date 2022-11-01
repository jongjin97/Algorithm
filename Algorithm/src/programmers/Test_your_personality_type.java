package programmers;

import java.util.HashMap;

public class Test_your_personality_type {
    private static HashMap<String , Integer> hashMap = new HashMap<>();

    public static void main(String[] args) {
        String[] str = {"AN", "CF", "MJ", "RT", "NA"};
        int[] numarr = {5,3,2,7,5};

        String result = solution(str, numarr);
        System.out.println(result);
    }

    public static String solution(String[] survey, int[] choices) {
        String answer = "";

        setup_HashMap();

        for(int i=0; i<survey.length; i++){
            String[] str = survey[i].split("");

            if(choices[i] > 4){
                hashMap.put(str[1], hashMap.get(str[1])+choices[i]-4);
            } else {
                hashMap.put(str[0], hashMap.get(str[0])+Math.abs(choices[i]-4));
            }
        }

        if(hashMap.get("R") >= hashMap.get("T"))
            answer += "R";
        else
            answer += "T";
        if(hashMap.get("C") >= hashMap.get("F"))
            answer += "C";
        else
            answer += "F";
        if(hashMap.get("J") >= hashMap.get("M"))
            answer += "J";
        else
            answer += "M";
        if(hashMap.get("A") >= hashMap.get("N"))
            answer += "A";
        else
            answer += "N";

        return answer;
    }

    public static void setup_HashMap(){
        hashMap.put("R", 0);
        hashMap.put("T", 0);
        hashMap.put("C", 0);
        hashMap.put("F", 0);
        hashMap.put("J", 0);
        hashMap.put("M", 0);
        hashMap.put("A", 0);
        hashMap.put("N", 0);
    }
}
