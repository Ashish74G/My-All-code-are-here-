
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1 ; 
    int r = n ;
    while (left <= r ){
        int mid = left + (r-left) /2 ;
        if (guess(mid) == 0) {
           return mid;
         }
         if ( guess(mid) == 1) left = mid + 1 ;

         else  { r = mid-1 ;}
    }
     return -1 ;
    }
}