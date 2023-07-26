package programmers;

import java.util.HashMap;

public class Running_race {

    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>();

        for(int i=0; i<players.length; i++){
            map.put(players[i], i);
            map2.put(i, players[i]);
        }

        for(int i=0; i<callings.length; i++){
            int start = map.get(callings[i]);
            int end = start-1;
            String endplay = map2.get(end);

            players[start] = endplay;
            players[end] = callings[i];

            map.put(callings[i], end);
            map.put(endplay, start);

            map2.put(start, endplay);
            map2.put(end, callings[i]);
        }

        return players;
    }
}
