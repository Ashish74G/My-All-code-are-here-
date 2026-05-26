class Solution {
    public String finalString(String s) {
      StringBuilder sub = new StringBuilder() ;
      for ( char c : s.toCharArray()){
        if ( c == 'i') sub.reverse() ;
        else sub.append(c) ;

      }

       return sub.toString() ;
    }
}