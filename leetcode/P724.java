class Solution {
    public int pivotIndex(int[] nums) {
      int sum_arr=0;
      for(int i=0;i<nums.length;i++){
        sum_arr+=nums[i];
      }

      int sum_temp=0;

      for(int i=0;i<nums.length;i++){
        if(sum_temp==sum_arr-nums[i]-sum_temp){
            return i;
        }
        sum_temp+=nums[i];
      }


      return -1;
        
        
    }
}