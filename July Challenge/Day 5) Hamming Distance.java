class Solution {
    public int hammingDistance(int x, int y) {
        
       long  b1=binaryConverter(x);
        long  b2=binaryConverter(y);
        int count=0;
        
        while(b1>0 || b2>0)
        {
            int d1=(int)b1%10;
            int d2=(int)b2%10;
            if(d1!=d2)
                count++;
            
            b1=b1/10;
            b2=b2/10;
            
        }
        return count;
        
        
    }
    
    public long binaryConverter(int n)
    {  int bin=0;
       int pow=1;
        while(n>0)
        {
            int dig=n%2;
            bin=bin+dig*pow;
            pow*=10;
            n=n/2;
        }
     
     return bin;
    }
}
