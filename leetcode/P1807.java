class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {

        Map<String, String> map= new HashMap<>();
        
        for(int i=0;i<knowledge.size();i++){
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));

        }

        StringBuilder ans= new StringBuilder();
        boolean flag=true;
        StringBuilder key= new StringBuilder("");
       
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                flag=false;
                key.setLength(0);
            }
            else if (s.charAt(i) == ')') {
                flag = true;

                String value = map.get(key.toString());

                if (value == null)
                    ans.append("?");
                else
                    ans.append(value);
            }

            else if(flag && s.charAt(i)!=' '){
                ans.append(s.charAt(i));
                
            }
            else if(!flag){
                key.append(s.charAt(i));
            }
            
        }

        return ans.toString();


        
    }


    
}