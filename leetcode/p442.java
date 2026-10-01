import java.util.ArrayList;
import java.util.List;

public class p442 {
    class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if (arr[correct]!=arr[i]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else{
                i++;
            }
        }
        List<Integer> ans=new  ArrayList<>();   
        for (int index=0; index<arr.length; index++){
            if(arr[index]!=index+1){
                ans.add(arr[index]);
            }
        }
        return ans;
        
    }
}
    
}
