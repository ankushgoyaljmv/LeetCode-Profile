class Solution {
    public boolean detectCapitalUse(String word) {
        
        if( word.length() == 0)  return false;
        int count1 = 0;
        int count2 = 0;
        int n = word.length();
        char first = word.charAt(0); 
        for( int i = 0 ; i < word.length() ; i++){
            
            int ch = word.charAt(i);
            
            if( ch >= 'A' && ch <= 'Z' ) 
                count1++;
            
            else
                count2++;
            
        }
        
       if (count1 == n || count2 == n ) return true;
    
        else if(count1 == 1 && count2 == n-1 && first >='A' && first <='Z') return true;
        
        else return false;
        
    }
}
