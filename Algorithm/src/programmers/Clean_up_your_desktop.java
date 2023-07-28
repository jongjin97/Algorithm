package programmers;

public class Clean_up_your_desktop {

    public int[] solution(String[] wallpaper) {
        String[][] map = new String[wallpaper.length][wallpaper[0].length()];

        int lux = Integer.MAX_VALUE;
        int luy = Integer.MAX_VALUE;
        int rdx = 0;
        int rdy = 0;

        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[0].length; j++){
                if(wallpaper[i].charAt(j) == '#'){
                    lux = Math.min(lux, j);
                    luy = Math.min(luy, i);
                    rdx = Math.max(rdx, j);
                    rdy = Math.max(rdy, i);
                }
            }
        }
        int[] answer = new int[4];

        answer[0] = luy;
        answer[1] = lux;
        answer[2] = rdy+1;
        answer[3] = rdx+1;

        return answer;
    }
}
