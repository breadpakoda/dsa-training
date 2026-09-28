import java.util.Scanner;

public class Largest_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int max=0;
        
        while(num!=0){
            if((num%10)>max){
                max=num%10;
            }
            
            num/=10;
        }
        System.out.println(max);
    }
    
}
