class StockSpanner {
    private Stack<int[]> st;
    public StockSpanner() {
        st = new Stack<>();
    }
    
    public int next(int price) {
        int span = 1;
        // While stack is not empty and top element's price is less than or equal to the current price
        while (!st.isEmpty() && st.peek()[0] <= price) {
            span += st.peek()[1];  // Add the span of the element being popped
            st.pop();
        }
        // Push current price and its span onto the stack
        st.push(new int[]{price, span});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */