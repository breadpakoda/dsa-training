public class Element_search {
    public static void main(String[] args) {
        System.out.println(search(new int[]{1,2,3,4,5,6}, 1));
        
    }
    

    static boolean search(int[] arr, int target){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
}
