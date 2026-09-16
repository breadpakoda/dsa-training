import java.util.Scanner;

public class Pythagorian_triplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();

        if((int)Math.pow(a, 2)+(int)Math.pow(b,2)==Math.pow(c,2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    
}
