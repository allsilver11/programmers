package lev_01;
import java.util.Arrays;

public class gavia {
   public static void main(String[] args) {
      String s = "abac";
      int n = 0;
       char[] slist = s.toCharArray();
           char[][] s1 = {slist,slist,slist,slist};
           for(int j=0; j<1; j++) {
        	   for(int i = 1; i < s1.length; i++){
        		   if(s1[j][i-1]!=s1[j][i]){
        			   n++;
        		   }
        	   }
           }
           System.out.println("ÃÑ °¹¼ö : " + n);
   }
}