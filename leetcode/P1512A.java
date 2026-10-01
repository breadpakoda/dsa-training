import java.util.*;

public class P1512A{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        for(int j=0;j<t;j++){
            
            int n= sc.nextInt();
            int[] arr= new int[n];
            
            for(int i =0 ;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            
            Map<Integer,Integer> pair= new HashMap<>();
            
            for(int i=0; i<arr.length;i++){
                if(pair.get(arr[i])==null){
                    pair.put(arr[i],1);
                }
                else{
                    pair.put(arr[i],(pair.get(arr[i]))+1);
                }
            }
           
            
            // System.out.println(pair.size());
            
            for(int i=0 ;i<arr.length;i++ ){
                if(pair.get(arr[i])==1){
                    System.out.println(i);
                    break;
                }
            }
            
           
            
            
            
            
            
            
            
            
            
            
            
            
            
        }
    }
}