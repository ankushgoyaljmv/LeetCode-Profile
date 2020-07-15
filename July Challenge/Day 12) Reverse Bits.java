public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {

    int ans = n;

    ans = ans >>> 16 |ans<<16;

    ans = (ans & 0xff00ff00) >>> 8 | (ans & 0x00ff00ff) << 8;

    ans = (ans & 0xf0f0f0f0) >>> 4 | (ans & 0x0f0f0f0f) << 4;

    ans = (ans & 0xcccccccc) >>> 2 | (ans & 0x33333333) << 2;

    ans = (ans & 0xaaaaaaaa) >>> 1 | (ans & 0x55555555) << 1;

    return ans;

}
        

}
