class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int count = 0;
        HashMap<Integer, Integer> list = new HashMap<>();
        for(int i=0;i<n;i++){
            list.put(i, heights[i]);
        }
        Arrays.sort(heights);
        for(int i=0;i<n;i++){
            if(heights[i] != list.get(i)){
                count++;
            }

        }
        return count;
    }
}