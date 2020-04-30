class Solution {
    public void reverseString(char[] s) {
        
        int end=s.length-1;
        //reversing till half only
        for(int i=0;i<s.length/2;i++)
        {
            char temp=s[i];
            s[i]=s[end];
            s[end]=temp;
            end--;
        }
        
       
        for(char ele: s)
        {
            System.out.print(ele);
        }
    
        
        
        
    }
}
