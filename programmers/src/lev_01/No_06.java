package lev_01;
import java.util.*;
/*
 * 
 * ���ڼ��ڼ�?
 * 
 */
public class No_06 {
	 public String solution(int n) {
	        String answer = "";
	        String[] a = new String[n];
	        for(int i=0;i<n;i+=2){
	            a[i] = "��";
	        }
	        for(int j=1;j<n;j+=2){
	            a[j] = "��";
	        }
	        for(int k=0;k<n;k++){
	            answer += a[k];
	        }
	        return answer;
	    }
}