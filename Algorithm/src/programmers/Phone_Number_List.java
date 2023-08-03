package programmers;

import java.util.Arrays;

public class Phone_Number_List {

    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);

        for(int i=0; i<phone_book.length-1; i++){
            String str = phone_book[i];

            if(phone_book[i+1].startsWith(str)) {
                System.out.println(phone_book[i] + " " + phone_book[i+1]);
                return false;
            }
        }

        return answer;
    }
}
