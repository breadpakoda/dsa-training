import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        int ans=nums[0];
        for(int i =1;i<nums.length;i++){
            ans^=nums[i];
        }


        return ans;
        
    }
}




// alternative approach



class Solution2 {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> pair= new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(pair.get(nums[i])==null){
                pair.put(nums[i],1);
            }

            else{
                pair.put(nums[i],pair.get(nums[i])+1);
            }
        }

        for(int i : nums){
            if(pair.get(i)==1){
                return i;
            }
        }

        return -1;
    }
}