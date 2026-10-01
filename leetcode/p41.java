public class p41 {

    class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]>0 && nums.length>=nums[i] && nums[correct]!=nums[i]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else{
                i++;
            }
        }
      
       for(int j = 0;j<nums.length;j++){
        if(nums[j]!=j+1){
            return j+1;
        }}
    return nums.length+1;
       
       
    }
}
    
}
