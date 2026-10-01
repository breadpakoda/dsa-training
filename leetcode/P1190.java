class Solution {
    public String reverseParentheses(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                count++;
            }
        }

        while(count!=0){




int index_open=0;
        int index_close=0;
        StringBuilder temp_string= new StringBuilder("");
        StringBuilder temp_ans= new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                index_open=i;
                
            }
            if(s.charAt(i)==')'){
                index_close=i;
                break;
            }
        }
        for(int i=index_close-1;i>index_open;i--){
            temp_string.append(s.charAt(i));
        }

        for(int i=0;i<index_open;i++){
            temp_ans.append(s.charAt(i));
        }
        temp_ans.append(temp_string);
        for(int i=index_close+1;i<s.length();i++){
            temp_ans.append(s.charAt(i));
        }

        s=temp_ans.toString();











            count--;
        }


        return s;
        
        
    }
}