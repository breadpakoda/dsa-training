import java.util.Arrays;
import java.util.Scanner;

public class Sort_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[6];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }


        


        for(int i=0;i<arr.length-1;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }


        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]+" is the smallest element");
        System.out.println(arr[arr.length-2]);
    }
    
}
