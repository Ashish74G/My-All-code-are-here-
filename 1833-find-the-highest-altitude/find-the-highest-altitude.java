class Solution {
    public int largestAltitude(int[] gain) {
        int cu = 0 ;
        int max = 0 ; 
        for ( int i = 0 ; i<gain.length ; i++){
            cu += gain[i] ;
            max = Math.max( cu , max );
        }return max ;
    }
}