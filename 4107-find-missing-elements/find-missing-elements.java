class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for ( int i = 0 ;i <nums.length ; i++){
            if ( nums[i]> max ) max = nums[i] ;
        }
        for ( int j = 0 ;j <nums.length ; j++){
            if ( nums[j]< min) min = nums[j] ;
        }
        HashSet<Integer> hash = new HashSet<>() ;
        ArrayList <Integer> ans = new ArrayList<>() ;
       for ( int num : nums){ hash.add(num);}
       for ( int i = min ; i <= max ; i++){
        if ( !hash.contains(i)) ans.add(i);
        
       }
       return ans ;
    }
}