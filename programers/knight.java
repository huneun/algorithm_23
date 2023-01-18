class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
            
        for(int n = 1; n<=number; n++) {
            int yak = 0;
            for(int i = 1; i*i<=n; i++){
                if(i*i == n) {
                    yak++;
                }else if(n%i==0) {
                    yak+=2;
                }
                    
            }
             if(yak>limit) {
                 yak = power;
             } 
            answer += yak;
        }

        return answer;
    }
}