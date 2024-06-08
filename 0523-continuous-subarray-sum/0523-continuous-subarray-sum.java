class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> list = new HashMap<>();
        list.put(0, 0);
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += nums[i];
            if(list.containsKey(sum % k)){
                if(list.get(sum % k) < i) return true;
            }else{
                list.put(sum % k, i + 1);
            }
        }
        return false;
    }
}