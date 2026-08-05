class Solution {
    public int maxProduct(int n) {
        int max = -1 ;
        int smax = -1 ;
        while ( n> 0 ){
            int digit = n % 10 ;
            if ( digit > max ){ smax = max ; max = digit ;}
            else if ( digit > smax ){ smax = digit ;}
            n /= 10 ;
        }
        int pr = smax * max ;
        return pr ;
    }
}