class Solution {
    public int lengthOfLastWord(String s) {
        s=s.strip();
        
        for(int i= s.length()-1; i>=0;i--){
            if(i==0){
                return s.length();
            }
            else if(s.charAt(i)==' '){
                return (s.length()-1-i);
            }
           
        }
        return 1;
        
    }
}