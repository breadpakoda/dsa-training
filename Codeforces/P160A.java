import java.util.Scanner;

public class P160A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int sum1=0;
        int sum2=0;
        int count=0;
        int count2=0;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(sum1<arr[i]){
                sum1+=arr[i];
                count++;
            }
            else{
                sum2=arr[i];

            }
        }

        if(sum1==sum2){
            ans=count+count2;
        }
        else if(sum2>sum1){
            
        }

        
    }
}