class SpecialStack {
    Stack<Integer> st;
    Stack<Integer> minSt;
    public SpecialStack() {
        // Define Stack
        st = new Stack<>();
        minSt = new Stack<>();
    }

    public void push(int val) {
        // Add an element to the top of Stack
        st.push(val);
        if( minSt.isEmpty() || val < minSt.peek()){
            minSt.push(val);
        }
        else{
            minSt.push(minSt.peek());
        }
    }

    public void pop() {
        // Remove the top element from the Stack
        if(!st.isEmpty())
        st.pop();
        minSt.pop();
        
    }

    public int peek() {
        // Returns top element of the Stack
        if(st.isEmpty()) return -1;
        return st.peek();
    }

    boolean isEmpty() {
        // Check if the stack is empty
        return st.isEmpty(); 
    }

    public int getMin() {
        // Finds minimum element of Stack
        if(minSt.isEmpty()) return -1;
        return minSt.peek();
    }
}

