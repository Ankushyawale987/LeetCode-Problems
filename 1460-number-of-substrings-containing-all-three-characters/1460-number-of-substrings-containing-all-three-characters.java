class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int[] lastSeen = {-1, -1, -1};
        int ans = 0;
        for(int i=0;i<n;i++){
            lastSeen[s.charAt(i) - 'a'] = i;
            ans = ans + 1 + Math.min(Math.min(lastSeen[0], lastSeen[1]), lastSeen[2]);

        }
        return ans;
    }
}