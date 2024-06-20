class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        int l = 1;
        int h = (int) 1e9;
        while(l + 1 < h) {
            int mid = (l + h) / 2;
            if(check(mid, position, m)) {
                l = mid;
            }else {
                h = mid;
            }
        }
        return l;
    }
    private boolean check(int mid, int pos[], int m) {
        int count = 0;
        int n = pos.length;
        count++;
        int lastPlaced = pos[0];
        for(int i = 1; i < n; i++) {
            if(pos[i] - lastPlaced >= mid) {
                count++;
                lastPlaced = pos[i];
            }
        }
        return count >= m;
    }
}