class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] fre =new int[4000];
        for ( int num : arr){
            fre[num + 1000]++ ;
        }
        for ( int i = 0 ; i< fre.length ; i++){
            if ( fre[i] == 0) continue ;
            for ( int j = i+1 ; j<fre.length ; j++){
                if (fre[j]== 0) continue ;
                if (fre[i] == fre[j]) return false ;
            }
        }
        return true ;
    }
}