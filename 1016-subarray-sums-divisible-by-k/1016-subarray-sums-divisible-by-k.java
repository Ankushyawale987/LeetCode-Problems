class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> list = new HashMap<>();
        list.put(0, 1);
        int prefix_sum = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            prefix_sum += nums[i];
            int rem = prefix_sum % k;
            if(rem < 0){
                rem = (rem + k);
            }
            if(list.containsKey(rem)){
                count += list.get(rem);
                list.put(rem, list.get(rem) + 1);
            }else{
                list.put(rem, 1);
            }
        }
        return count;
    }
}