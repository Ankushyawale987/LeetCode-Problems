class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int ans[] = new int[arr1.length];
        HashMap<Integer, Integer> list = new HashMap<>();
        for(int x:arr1){
            list.put(x, list.getOrDefault(x, 0) + 1);

        }
        int i=0;
        for(int x:arr2){
            int count = list.get(x);
            while(count > 0){
                ans[i++] = x;
                count--;
            }
            list.remove(x);
        }
        List<Integer> remaining = new ArrayList<>();
        for(int x:arr1){
            if(list.containsKey(x)){
                int count = list.get(x);
                while(count > 0){
                    remaining.add(x);
                    count--;
                }
                list.remove(x);
            }
        }
        Collections.sort(remaining);
        for(int x : remaining){
            ans[i++] = x;
        }
        return ans;
    }
}