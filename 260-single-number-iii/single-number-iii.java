import java.util.* ;
class Solution {
    public int[] singleNumber(int[] nums) {
     Set<Integer> set = new HashSet<>();
      for ( int n : nums) {
        if (!set.add(n))
        set.remove(n) ;
      }
      int[] arr = new int[2] ;
      int i = 0 ;
      for ( int n : set ){
      arr[i] = n ; i++ ;
    }
      return arr ;
    }
}