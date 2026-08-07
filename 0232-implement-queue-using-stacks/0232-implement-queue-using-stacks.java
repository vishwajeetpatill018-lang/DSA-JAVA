class MyQueue {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        
        // st ka bottom remove karna hai
        // Push all elements from st1 to st2 except bottom
        // Pop the bottom element
        // Push all elements from st2 to st1

        while(st.size() >1){
            st2.push(st.pop());
        }
       int front =  st.pop();
        while(st2.size() >0){
            st.push(st2.pop());
        }
        return front;
         
    }
    
    public int peek() {
        // st ka bottom display karna hai
        // st ke elements push karo st2 mai
        // st.peek()
        // st2 ke sare elements push karo st mai

        while(st.size() > 1){
            st2.push(st.pop());
        }
        int peek = st.peek();

        while(st2.size() >0){
            st.push(st2.pop());
        }
        return peek;
    }
    
    public boolean empty() {
        return st.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
