package lev_01;
import java.util.*;
/*
 * 
 * 수박수박수?
 * 
 */
public class No_06 {
	 public String solution(int n) {
	        String answer = "";
	        String[] a = new String[n];
	        for(int i=0;i<n;i+=2){
	            a[i] = "수";
	        }
	        for(int j=1;j<n;j+=2){
	            a[j] = "박";
	        }
	        for(int k=0;k<n;k++){
	            answer += a[k];
	        }
	        return answer;
	    }
}