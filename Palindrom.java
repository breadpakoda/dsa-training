import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int rev=0;

        while(temp!=0){
            rev=(rev*10)+temp%10;
            temp/=10;
        }

        if(rev==num){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("Not a palindrom");
        }
    }
    
}
