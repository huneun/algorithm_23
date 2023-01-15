import java.util.*;
import java.lang.*;

class Solution {
    public int[] solution(String str) {
        int[] answer = new int[str.length()];
        
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            count = 0;
            for(int j = 0; j<i; j++){
                if(str.charAt(i) == str.charAt(j)){
                    count = i-j;
                }
            }
            if(count == 0) {
                answer[i] = -1;
            }else {
                answer[i] = count;
            }
        }
        
        return answer;
    }
}