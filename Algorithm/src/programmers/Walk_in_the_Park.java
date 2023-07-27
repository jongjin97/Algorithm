package programmers;

import java.util.Arrays;

public class Walk_in_the_Park {

    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        String[][] map = new String[park.length][park[0].length()];

        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[0].length; j++){
                map[i][j] = String.valueOf(park[i].charAt(j));
                if(map[i][j].equals("S")){
                    answer[0] = i;
                    answer[1] = j;
                }

            }
        }

        for(int i=0; i< routes.length; i++){
            String[] route = routes[i].split(" ");
            if(check(map, answer, route[0], Integer.parseInt(route[1]))){
                if(route[0].equals("E"))
                    answer[1] += Integer.parseInt(route[1]);
                else if(route[0].equals("W"))
                    answer[1] -= Integer.parseInt(route[1]);
                else if(route[0].equals("N"))
                    answer[0] -= Integer.parseInt(route[1]);
                else
                    answer[0] += Integer.parseInt(route[1]);
            }
        }

        return answer;
    }

    public boolean check(String[][] park, int[] position, String direction, int dist){
        if(direction.equals("E")){
            if(position[1] + dist >= park[0].length)
                return false;
            for(int i=position[1]; i<=position[1]+dist; i++){
                if(park[position[0]][i].equals("X"))
                    return false;
            }
        } else if(direction.equals("W")){
            if(position[1] - dist < 0)
                return false;
            for(int i=position[1]; i>=position[1]-dist; i--){
                if(park[position[0]][i].equals("X"))
                    return false;
            }
        }  else if(direction.equals("N")){
            if(position[0] - dist < 0)
                return false;
            for(int i=position[0]; i>=position[0]-dist; i--){
                if(park[i][position[1]].equals("X"))
                    return false;
            }
        }  else if(direction.equals("S")){
            if(position[0] + dist >= park[0].length)
                return false;
            for(int i=position[0]; i<=position[0]+dist; i++){
                if(park[i][position[1]].equals("X"))
                    return false;
            }
        }
        return true;
    }
}
