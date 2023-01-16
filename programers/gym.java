import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        int[] num = new int[n];
        for(int i =0; i<n; i++) {
            num[i] = 1;
            for(int l : lost) {
                if(l == i+1){
                    num[i] --;
                    break;
                }   
            }
             for(int r : reserve) {
                if(r == i+1){
                    num[i] ++;
                    break;
                }   
            }
        }
        
        for(int i =1; i<n; i++) {
            if(num[i-1] == 0 && num[i] ==2){
                num[i-1]++; num[i]--;
            }
            if(num[i-1] == 2 && num[i] ==0){
                num[i-1]--; num[i]++;
            }
            if(num[i-1] !=0 ){
                answer++;
            }
        }
        if(num[n-1] != 0){
            answer++;
        }
        return answer;
    }
}