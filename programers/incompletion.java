import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<Integer, List<String>> p_map = new HashMap<>();
        Map<Integer, List<String>> c_map = new HashMap<>();
        
        for(int i= 0; i<participant.length; i++) {
            if(p_map.containsKey(participant[i].length())){
                List<String> list = p_map.get(participant[i].length());
                list.add(participant[i]);
                p_map.put(participant[i].length(), list);
            }else {
                List<String> list = new ArrayList<>();
                list.add(participant[i]);
                p_map.put(participant[i].length(), list);
            }  
        }
        
        for(int i= 0; i<completion.length; i++) {
            if(c_map.containsKey(completion[i].length())){
                List<String> list = c_map.get(completion[i].length());
                list.add(completion[i]);
                c_map.put(completion[i].length(), list);
            }else {
                List<String> list = new ArrayList<>();
                list.add(completion[i]);
                c_map.put(completion[i].length(), list);
            }  
        }
        
        int targetKey = 0;
        for(int i = 1; i<=20; i++) {
            if(!c_map.containsKey(i) && p_map.containsKey(i)) {
                answer = p_map.get(i).get(0);
                break;
            }
            if(c_map.containsKey(i) && p_map.containsKey(i))
            if(c_map.get(i).size() != p_map.get(i).size()){
                targetKey = i;
                break;
            } 
        }
        
        if(answer.length()<1) {
            List<String> p_list = p_map.get(targetKey);
            List<String> c_list = c_map.get(targetKey);
            for(int i = 0; i<p_list.size(); i++) {
                for(int j = 0; j<c_list.size(); j++) {
                    if(p_list.get(i).equals(c_list.get(j))){
                        p_list.remove(i);
                        c_list.remove(j);
                        j --;
                        i --;
                        break;
                    }
                }
            }
            answer = p_list.get(0);
        }
        
        return answer;
    }
}