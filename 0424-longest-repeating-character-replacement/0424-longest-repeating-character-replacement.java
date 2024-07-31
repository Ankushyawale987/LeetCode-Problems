class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int[] arr = new int[26];
        int l = 0, r=0;
        int maxf = 0, len = 0;
        int maxLen = 0;
        while(r < n){
            arr[s.charAt(r) - 'A']++;
            maxf = Math.max(maxf, arr[s.charAt(r) - 'A']);
            if(r - l + 1 - maxf > k){
                arr[s.charAt(l) - 'A']--;
                l++;
            }
            maxLen = Math.max(maxLen, r - l + 1);

            r++;
        }
        return maxLen;
    }
}