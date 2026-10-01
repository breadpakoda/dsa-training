class Solution {
    public int largestAltitude(int[] gain) {
        
        int highest_alt=0;
        int current_alt=0;
        for(int i=0 ;i<gain.length;i++){
            if(gain[i]+current_alt>highest_alt){
                highest_alt=current_alt+gain[i];
            }
            current_alt+=gain[i];
        }

        return highest_alt;
    }
}