class Solution {
    public int balancedStringSplit(String s) {
        int n = s.length();
        int i =0;
        int count = 0;
        int l=0,r=0;
        while(i < n){
            if(s.charAt(i) == 'L'){
                l++;
            }else{
                r++;
            }
            i++;
            if(l == r) count++;
        }
        return count;
    }
}