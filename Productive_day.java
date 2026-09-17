import java.util.Scanner;

public class Productive_day {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int count=0;

        System.out.print("Enter the number of days: ");
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++){
            System.out.print("Enter the number: ");
            int solved=sc.nextInt();
            if(solved>=10 && solved%2==0){
                count++;
            }
        }
        
        
        
        System.out.println(count);
    }
    
}
