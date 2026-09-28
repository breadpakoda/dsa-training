import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class P1352A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int k=sc.nextInt();
        
        
        
        for(int i=0;i<k;i++){
            
            int t= sc.nextInt();
            Map<Integer,Integer> seq= new HashMap<>();
            int q=0;
            int temp=t;
            
            while(t!=0){
                if(t%10!=0){
                seq.put(q,t%10);
            }
            t/=10;
            q++;
                
            }
            System.out.println(seq.size());
            for(int p=String.valueOf(temp).length();p>=0;p--){
                if(seq.containsKey(p)){
                    System.out.println(seq.get(p)*(int)Math.pow(10,p));
                }
                
            }


            
            
            
            
            
            
            
        }
    }
}