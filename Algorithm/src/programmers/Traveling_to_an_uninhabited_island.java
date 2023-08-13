package programmers;

import java.util.*;

public class Traveling_to_an_uninhabited_island {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public int[] solution(String[] maps) {
        int[] answer = {};

        int[][] map = new int[maps.length][maps[0].length()];
        boolean[][] check = new boolean[map.length][map[0].length];
        ArrayList<Integer> arrayList = new ArrayList();
        Queue<int[]> queue = new LinkedList();

        for(int i=0; i< map.length; i++){
            for(int j=0; j<map[0].length; j++){
                if(maps[i].charAt(j) != 'X')
                    map[i][j] = maps[i].charAt(j) - 48;
            }
        }

        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[0].length; j++){
                int tmp = 0;
                if(map[i][j] != 0 && !check[i][j]){
                    queue.add(new int[] {i, j});
                    check[i][j] = true;
                    while(!queue.isEmpty()){
                        int[] curr = queue.poll();
                        tmp += map[curr[0]][curr[1]];
                        int x = 0;
                        int y = 0;
                        for(int k=0; k<4; k++){
                            y = curr[0] + dy[k];
                            x = curr[1] + dx[k];
                            if(x>=0 && y>=0 && y< maps.length && x<map[0].length && !check[y][x] && map[y][x] != 0){
                                queue.add(new int[] {y,x});
                                check[y][x] = true;
                            }
                        }
                    }
                }
                if(tmp != 0 )
                    arrayList.add(tmp);
            }
        }
        answer = new int[arrayList.size()];
        Collections.sort(arrayList);
        for(int i=0; i< arrayList.size(); i++){
            answer[i] = arrayList.get(i);
        }
        return answer.length > 0 ? answer : new int[] {-1};
    }

}
