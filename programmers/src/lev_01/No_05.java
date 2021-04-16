package lev_01;
import java.util.*;
/*
 * 
 * 나누어 떨어지는 숫자 배열
 * 
 */
public class No_05 {
	 public ArrayList<Integer> solution(int[] arr, int divisor) {
	        ArrayList <Integer> answer = new ArrayList<Integer>();
	        for(int i=0;i<arr.length;i++){
	            if(arr[i]%divisor==0){
	                answer.add(arr[i]);
	            }
	        }
	        if(answer.isEmpty()){
	            answer.add(-1);
	        }
	        Collections.sort(answer);
	        return answer;
	    } 
}