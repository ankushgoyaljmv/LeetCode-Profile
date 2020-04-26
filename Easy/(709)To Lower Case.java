//Problem:
//https://leetcode.com/problems/to-lower-case

class Solution {
    
    //Using toCharArray
    public String toLowerCase(String str) {
        
        char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 65 && arr[i] <= 90)
				arr[i] += 32;
		}
		return new String(arr);
    }
}

//     public String toLowerCase(String str) {
        
//         return str.toLowerCase();
        
        
//     }
// }
