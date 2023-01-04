import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] joka = {"aya", "ye", "woo", "ma"};
        
        for(String str : babbling){
            int temp = 0;
            for(String jo : joka) {
                if(str.contains(jo)) {
                    temp+=jo.length();
                } 
            }
            if(temp == str.length())
                answer++;
        }
        return answer;
    }
  
}