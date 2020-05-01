class Solution {
    public String generateTheString(int n) {
        
        String str="";
        
        if(n%2!=0)
        {
            for(int i=0;i<n;i++)
            {
                str+='a';
            }
            
            return str;
        }
        
        else
        {
            str+='a';
            for(int i=1;i<n;i++)
            {
                str+='b';
            }
            
            return str;
        }
        
    }
}
