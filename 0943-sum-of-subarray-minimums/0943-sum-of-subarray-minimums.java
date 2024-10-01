class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] nse = new int[n];
        int[] psee = new int[n];

        long total = 0;
        int mod = (int) (1e9 + 7);

        nseFunc(arr, nse);
        pseeFunc(arr, psee);

        for(int i=0;i<n;i++){
            long left = i - psee[i];
            long right = nse[i] - i;
            total = (total + (left * right % mod) * arr[i] % mod) % mod;
        }
        return (int)(total);
    }

    private void nseFunc(int[] arr, int[] nse){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for(int i=n - 1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
    }

    private void pseeFunc(int[] arr, int[] psee){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            psee[i] = st.isEmpty() ? -1 : st.peek();
        st.push(i);
        }
    }
}