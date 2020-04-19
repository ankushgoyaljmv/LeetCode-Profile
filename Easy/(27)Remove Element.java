class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val)
                --n;
        }

        int j=n;

        for (int i = 0; i < n; i++) {
            if (nums[i] == val) {
                swap(nums, i, j);
                j++;
            }
        }

        return n;
    }
    public int[] swap(int arr[], int i ,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;

    }
}
