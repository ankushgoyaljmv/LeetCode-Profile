///Problem:
//https://leetcode.com/problems/spiral-matrix/

class Solution {
    public List < Integer > spiralOrder(int[][] Matrix) {

        ArrayList < Integer > res = new ArrayList < > ();
        if (Matrix.length == 0) {
            return res;
        }

        int rMin = 0;
        int rMax = Matrix.length - 1;
        int cMin = 0;
        int cMax = Matrix[0].length - 1;

        while (rMin <= rMax && cMin <= cMax ) {
            
            // top wall
            for (int i = cMin; i <= cMax; i++) {

                res.add(Matrix[rMin][i]);
                
            }
            rMin++;

            // right side wall
            for (int i = rMin; i <= rMax; i++) {

                res.add(Matrix[i][cMax]);
                
            }
            cMax--;

            //Bottom Wall
            if (rMin <= rMax) {
                for (int i = cMax; i >= cMin; i--) {

                    res.add(Matrix[rMax][i]);
                    
                }
            }
            rMax--;

            //Left Wall
            if (cMin <= cMax) {
                for (int i = rMax; i >= rMin; i--) {

                    res.add(Matrix[i][cMin]);
                    
                }
            }
            cMin++;


        }

        return res;

    }
}
