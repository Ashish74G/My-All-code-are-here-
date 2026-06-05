class Solution {
    public int balancedStringSplit(String s) {
       int count = 0;
       int zero = 0 ;
       for ( int i = 0 ;i< s.length() ;i++){
        if ( s.charAt(i) == 'R') zero++ ;
        else zero-- ; 

       
       if ( zero == 0 ) count++ ;}
       return count ;
    }
}