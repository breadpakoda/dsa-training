import java.util.Scanner;

public class Check_prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int x= sc.nextInt();
        int i=2;
        while(i<x){
            if(x%i==0){
                System.out.println("no");
                return;
            }
            i++;


        }
        System.out.println("yes");
    }
    
}
