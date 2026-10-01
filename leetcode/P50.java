class Solution {
    public double myPow(double x, int n) {
        if(n<Integer.MIN_VALUE || n>Integer.MAX_VALUE){ return 0;}
        

        return (double)Math.pow(x,n);

    }
}