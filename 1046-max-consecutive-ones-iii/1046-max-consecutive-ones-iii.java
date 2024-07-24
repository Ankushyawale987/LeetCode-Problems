class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, right = 0, count = 0;
        int n = nums.length;
        while(right < n){
            if(nums[right] == 0){
                count++;
            }
            if(count > k){
                if(nums[left] == 0){
                    count--;
                }
                left++;
            }
            right++;
        }
        return right - left;
    }
}