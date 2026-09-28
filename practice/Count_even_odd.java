import java.util.Scanner;

public class Count_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int count_even=0;
        int count_odd=0;
        while(num!=0){
            if((num%10)%2==0){
                count_even++;
            }
            else{
                count_odd++;
            }
            num/=10;
        }

        System.out.println(count_even);
        System.out.println(count_odd);
    }
    
}
