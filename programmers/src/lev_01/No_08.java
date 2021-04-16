package lev_01;
import java.util.*;
/*
 * 
 * 콜라츠 추측
 * 
 */
public class No_08 {
	public int solution(long num) {
        int answer = 0;
        for(int i=0;i<500;i++){
            if(num%2 == 0){
                num = num/2;
                answer++;
            }else if(num == 1){
                break;
            }else if(num%2 != 0){
                num = num*3+1;
                answer++;
            }
        }
        if(num != 1){
            answer = -1;
        }
        return answer;
    }
}