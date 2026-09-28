import java.util.Arrays;

public class Bubble_sort {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Sort_array(new int[]{5,2,3,5,12,6,2,53,543,43,532,523,5,235,23})));
    }




    static int[] Sort_array(int[] arr){
        
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        



        return arr;

    } 
    
}
