class P1470{
    class Solution {
    public int[] shuffle(int[] nums, int n) {
        int k=0;
        int[] ans = new int[2*n];
        for(int i=0;i<n ;i++){
            ans[k++]=nums[i];
            ans[k++]=nums[i+n];
        }
        return ans;
    }
}
}