class P268{
    class Solution {
    public int missingNumber(int[] arr) {
       int i = 0;

while(i < arr.length) {
    if(arr[i] < arr.length && arr[i] != i) {
        int temp = arr[i];
        arr[i] = arr[temp];
        arr[temp] = temp;
    } else {
        i++;
    }
}
        

        for(i = 0; i < arr.length; i++) {
            if(arr[i] != i) {
                return i;
            }
        }

        return arr.length;
    }
}
}