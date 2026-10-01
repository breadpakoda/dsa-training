class Solution {
    public int missingNumber(int[] nums) {
        
        int sum_original=0;
        for(int i=0 ; i<nums.length; i++){
            sum_original+=nums[i];
            
        }

        int sum_expected=0;
        for(int i=0; i<=nums.length;i++){
            sum_expected+=i;
        }
      
        
        return sum_expected-sum_original;
        
        

        
    }
}