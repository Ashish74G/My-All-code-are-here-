class Solution {
    public int arrangeCoins(int n) {
      int c = 1 ;
      while ( n != 0 ){
        if ( n/c != 0  ){ n-= c;
        c++ ;}
        else break ;
      }
        return c-1;
    }
}