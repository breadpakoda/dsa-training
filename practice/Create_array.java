import java.util.Arrays;
import java.util.Scanner;

class Create_array{
    public static void main(String[] args){
        int[] arr= new int[5];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr);

        
    }
}