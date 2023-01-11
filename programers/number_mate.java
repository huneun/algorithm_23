import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String[] compareStr = {"0","1","2","3","4","5","6","7","8","9"};
        
        for(int i = compareStr.length-1; i >= 0; i--) {
            int x_target_num = X.length()-X.replaceAll(compareStr[i], "").length();
            int y_target_num = Y.length()-Y.replaceAll(compareStr[i], "").length();
            
            if(x_target_num < 1 || y_target_num < 1) {
                continue;
            }
            
            if(x_target_num > y_target_num)       
                sb.append(compareStr[i].repeat(y_target_num));
            else 
                sb.append(compareStr[i].repeat(x_target_num));
                       
        } 
        
        answer = sb.toString();
        if(answer.length() < 1) {
            return "-1";
        }
        if(answer.substring(0, 1).equals("0")){
            answer = "0";
        }
        
        return  answer;
    }
}