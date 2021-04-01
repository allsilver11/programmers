package lev_01;
import java.util.*;
/*
 * 
 * 두 개 뽑아서 더하기
 * 
 */
public class No_01 {
	public static void main(String[] args) {
			int[] numbers= {2,1,3,4,1};
//			int[] numbers= {5,0,2,7};
	        List<Integer> list=new ArrayList<>();
	        int nlength=numbers.length;
	        for(int i=0;i<nlength;i++){
	            for(int j=i+1;j<nlength;j++){
	                int a=numbers[i]+numbers[j];
	                if(!list.contains(a)){list.add(a);}
	            }
	        }
	        
	        int[] answer = new int[list.size()];
	        for(int i=0;i<list.size();i++){
	            answer[i]=list.get(i);
	        }
	        Arrays.sort(answer);
	        System.out.println(Arrays.toString(answer));
	    }
	}
