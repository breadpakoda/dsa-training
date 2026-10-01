public class P1658 {
    public static void main(String[] args) {
        Solution ans= new Solution();
        
        System.out.println(ans.minOperations(new int[]{1,1,4,2,3}, 5));
    }
    
}




class Solution {
    public int minOperations(int[] nums, int x) {
        int count=0;
        int i=0;
        while(x!=0 && i<nums.length){
            if(x<0) 
            {
                return -1;
            }
            if(nums[i]>nums[nums.length-i-1]){
                if((x-nums[i])>0){
                    x-=nums[i];
                    count++;
                }
            }
            else{
                if(x-nums[nums.length-i-1]>0){
                    x-=nums[nums.length-i-1];
                    count++;
                }
            }
            i++;
        }

        return count;
    }
}
