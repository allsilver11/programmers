package lev_01;
import java.util.Arrays;
/*
 * 
 * 완주하지 못한 선수
 * 
 */
public class No_04 {
	public static void main(String[] args) {
//		String[] participant = {"leo", "kiki", "eden"}; 
//		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"}; 
		String[] participant = {"mislav", "stanko", "mislav", "ana"}; 
//		String[] completion = {"eden", "kiki"};
//		String[] completion = {"josipa", "filipa", "marina", "nikola"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		int i=0;
		String xcomp = "";
        Arrays.sort(participant); 
        Arrays.sort(completion); 
        System.out.println(Arrays.toString(participant));
        System.out.println(Arrays.toString(completion));
        for(i=0;i<completion.length;i++){
            if(!participant[i].equals(completion[i])){
            	xcomp = participant[i];
            }
        }
        xcomp = participant[i];
        System.out.println("완주하지 못한 선수 : " + xcomp);
	}
}
