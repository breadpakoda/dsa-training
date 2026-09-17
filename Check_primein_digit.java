import java.util.Scanner;

public class Check_primein_digit {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int count_p=0;
        int count_c=0;
        int count=0;
        
        while(n>0){
            int digit=n%10;
            
                 int i=2;   
            while(i<digit){
            if(digit%i==0){
                count_c++;
                break;
            }
            i++;


        }



            n=n/10;
            
        }
        
        System.out.println(count_c);
        
    }
    
}
