class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> map =new HashMap<>();
        int maxi = 0;
        int presum = 0;
        int cnt = 0;
        map.put(0, 1);
        for(int i=0;i<nums.length;i++){
            presum += nums[i];
            int rem = presum - goal;
            cnt = cnt + map.getOrDefault(rem, 0);
            map.put(presum, map.getOrDefault(presum, 0) + 1);
        }
        return cnt;
    }
}