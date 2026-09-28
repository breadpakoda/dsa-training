import java.util.Scanner;

public class Second_largest_inarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[6];
        

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int max=arr[0];
        int sec_max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>sec_max && arr[i]<max){
                sec_max=arr[i];
            }
        }
        System.out.println(max+ " is the largest");
        System.out.println(sec_max+ " is the second largest");
        
    }
    
}
