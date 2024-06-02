class Solution {
    public void rotate(int[] nums, int k) {
        int l = 0;
        int n = nums.length;
        k = k % n;
        reverse(nums, l, n - 1);
        reverse(nums, l, k - 1);
        reverse(nums, k, n - 1);
    }
    public static void reverse(int[] arr, int l, int last){
        while(l <= last){
            int temp = arr[l];
            arr[l] = arr[last];
            arr[last] = temp;
            l++;
            last--;
        }
    }
}