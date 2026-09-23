import java.util.*;

public class P546A{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    int first_cost=sc.nextInt();
    int initial=sc.nextInt();
    int wanted=sc.nextInt();
    
    int total_cost=0;
    
    for(int i=1;i<=wanted;i++){
        total_cost=total_cost+(first_cost*i);
    }
    int borrow=total_cost-initial;
    if(borrow<0){
        System.out.println(0);
    }
    else{
        System.out.println(borrow);
    }

    }
}