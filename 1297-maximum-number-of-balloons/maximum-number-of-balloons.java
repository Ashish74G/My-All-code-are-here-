class Solution {
    public int maxNumberOfBalloons(String text) {
       // char[] ch = text.toCharArray() ;
        int[] freq = new int[256];
        for (char ch : text.toCharArray()){
            freq[ch ]++ ;
            
        }int ans = 0 ;
        while ( freq['b'] > 0 && freq['a'] > 0 &&  freq['l'] >= 2 &&  freq['o'] >= 2 && freq['n'] > 0){
                freq['b']--;
            freq['a']--;  freq['l'] -= 2;  freq['o'] -= 2;   freq['n']--;  ans++ ;}
        return ans ;
    }
}