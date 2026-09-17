import java.util.Scanner;

public class Imporvement_day_count {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int a=sc.nextInt();
        int count=0;
        for(int i=0;i<n-1 ;i++){
            int b=sc.nextInt();
            if((b-a)>=3){
                count++;
            }
            a=b;

        }
        System.out.println(count);
    }
    
}
