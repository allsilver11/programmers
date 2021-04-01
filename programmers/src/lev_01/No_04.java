package lev_01;
import java.util.Arrays;
/*
 * 
 * 완주하지 못한 선수
 * 
 */
public class No_04 {
    public String solution(String[] participant, String[] completion) {
        int i=0;
		String xcomp = "";
        Arrays.sort(participant); 
        Arrays.sort(completion); 
        for(i=0;i<completion.length;i++){
            if(!completion[i].equals(participant[i])){
            	xcomp = participant[i];
                return xcomp;
            }
        }
        xcomp = participant[i];
        return xcomp;
    }
}
