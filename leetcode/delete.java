import java.util.Arrays;

public class delete {
    public static void main(String[] args) {
        int[] nums=new int[10];
        nums[0]=1;
        nums[1]=2;
        nums[2]=4;
        nums[3]=5;
        nums[5]=6;

        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[correct]!=nums[i]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    
}
