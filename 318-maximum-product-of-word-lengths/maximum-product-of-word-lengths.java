class Solution {
    public int maxProduct(String[] words) {
        int ans = 0 ;
        for ( int i = 0 ; i<words.length ; i++){
            for ( int j = i+1 ; j<words.length ; j++){
                boolean[] ar = new boolean[26] ;
                for ( int k = 0 ; k<words[i].length() ; k++){
                    ar[words[i].charAt(k) - 'a'] = true ;}
                    boolean com = false ;
                for ( int k = 0 ;k<words[j].length() ; k++){
                   
                    if (ar[words[j].charAt(k) - 'a']) {
                    com = true ;
                    break ;
                    }

            }
             
                if (!com) {
                    ans = Math.max(ans,
                            words[i].length() * words[j].length());
                            }
                    }
         }
        return ans ;

    }
}