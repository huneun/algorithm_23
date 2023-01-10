 String answer = "";
        StringBuilder sb = new StringBuilder();
        
        char[] xc = X.toCharArray();
        char[] yc = Y.toCharArray();
        Arrays.sort(xc);
        Arrays.sort(yc);
        X = String.valueOf(xc);
        Y = String.valueOf(yc); 
                
        String[] compareStr = {"0","1","2","3","4","5","6","7","8","9"};
   
        for(int i = 0; i<compareStr.length; i++) {
            
            if(!(X.contains(compareStr[i]) && Y.contains(compareStr[i]))) {
                continue;
            }
            
            int x_num = X.lastIndexOf(compareStr[i]) - X.indexOf(compareStr[i]);
            int y_num = Y.lastIndexOf(compareStr[i]) - Y.indexOf(compareStr[i]);
            
            int repeatNum = 0;
            if(x_num > y_num){
                repeatNum  = y_num+1;
            }else {
                repeatNum  = x_num+1;
            }
            
            sb.insert(0,compareStr[i].repeat(repeatNum)) ;
            
        }
        
        answer = sb.toString();
        if(answer.length() < 1) {
            return "-1";
        }
        
        return Integer.parseInt(answer) == 0? "0" : answer;