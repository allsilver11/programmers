package lev_01;
import java.util.ArrayList;

public class Kakaocommerce_01 {
    public int solution(int[] gift_cards, int[] wants) {
        int answer = 0;
        ArrayList<Integer> glist = new ArrayList<>();
        ArrayList<Integer> wlist = new ArrayList<>();
        // 겹치는 것 빼고 어레이리스트에 담기
        for(int i=0;i<wants.length;i++){
            if(gift_cards[i]!=wants[i]){
                glist.add(gift_cards[i]);
                wlist.add(wants[i]);
            }
        }
        //비교
        for(int g=0;g<glist.size();g++){
            for(int w=0;w<wlist.size();w++){
                if(glist.get(g) == wlist.get(w)){
                   wlist.remove(w); 
                    }   
                }
            }
        answer = wlist.size();
        return answer;
        }
    }