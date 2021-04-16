package lev_01;
import java.util.*;
/*
 * 
 * 2016³â
 * 
 */
public class No_09 {
	 public String solution(int a, int b) {
	        int tday=0;
	        String answer = "";
	        String day[] = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
	        int mon[] = {31,29,31,30,31,30,31,31,30,31,30,31};
	        for(int i=0;i<a-1;i++){
	            tday += mon[i];
	        }
	        tday += b-1;
	        answer = day[tday%7];
	        return answer;
	    }
}