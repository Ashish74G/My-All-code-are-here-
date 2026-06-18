class Solution {
    public double angleClock(int hour, int minutes) {
       double angle = 0 ; 
       if ( angle == 12) angle = 0 ;
      angle = Math.abs(30 * hour - 5.5 * minutes);
        return Math.min(angle , 360 - angle) ;
    }
}