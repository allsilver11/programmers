package lev_01;
import java.util.*;
/*
 * 
 * ���￡�� �輭�� ã��
 * 
 */
public class No_03 {
	public String solution(String[] seoul) {
        String answer = "";
       for(int i=0;i<seoul.length;i++){
           if(seoul[i].equals("Kim")){
               answer = "�輭���� " + i + "�� �ִ�";        
               break;
           }
       }
       return answer; 
   }
}
