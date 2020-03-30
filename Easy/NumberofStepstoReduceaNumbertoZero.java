import java.util.*;

class Solution {
    public int numberOfSteps (int num) {
        
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int count=0;
        while(n!=0)
        {
            if(n%2==0)
            {
                n/=2;
                count++;
            }
            else{
                n-=1;
            count++;
                    }
        }
         return count;
        
    }
   
}
