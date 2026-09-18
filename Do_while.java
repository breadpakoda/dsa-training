import java.util.Scanner;

public class Do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int len = String.valueOf(num).length();   
        int i=0;
        int count=0;


        do{
            
            
            if(num%10==7){
                count++;
            }
            num/=10;
            i++;


        
            
        }

        while(i<len);
        System.out.println(count);
    }

    
}
