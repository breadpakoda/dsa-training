import java.util.Scanner;

public class Watermellon_codeforces {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int w= sc.nextInt();
        int a= Integer.parseInt(Integer.toBinaryString(w));
        if(a%10==0 && w>2){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        
    }
    
}
