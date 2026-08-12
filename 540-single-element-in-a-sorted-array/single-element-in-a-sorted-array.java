class Solution {
    public int singleNonDuplicate(int[] nums) {
         int[] freq = new int[100001] ; 
         for (int num : nums){
            freq[num]++ ;
         }
         for ( int num : nums){
            if ( freq[num] == 1) return num ;
         }
         return -1 ;
    }
}