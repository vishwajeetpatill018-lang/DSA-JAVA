class MyQueue {

        // This Push Efficient Approach
        // Study POP(or peek ) efficient approach also (IMP FOR INTERVIEWS)
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
    public MyQueue() {
        
    }
    
    // public void push(int x) {
    //     // O(1)
    //     st.push(x);
    // }
    
    // public int pop() {
        
    //      // O(n) time and space
    //     // st ka bottom remove karna hai
    //     // Push all elements from st1 to st2 except bottom
    //     // Pop the bottom element
    //     // Push all elements from st2 to st1

    //     while(st.size() >1){
    //         st2.push(st.pop());
    //     }
    //    int front =  st.pop();
    //     while(st2.size() >0){
    //         st.push(st2.pop());
    //     }
    //     return front;
         
    // }
    
    // public int peek() {
    //     // O(n) time and space
    //     // st ka bottom display karna hai
    //     // st ke elements push karo st2 mai
    //     // st.peek()
    //     // st2 ke sare elements push karo st mai

    //     while(st.size() > 1){
    //         st2.push(st.pop());
    //     }
    //     int peek = st.peek();

    //     while(st2.size() >0){
    //         st.push(st2.pop());
    //     }
    //     return peek;
    // }
    
    // public boolean empty() {
    //     return st.isEmpty();
    // }


    public void push(int x){
        // Push everytime at bottom of stack 
        while(st.size() > 0){
            st2.push(st.pop());
        }
        st.push(x);
        while(st2.size() > 0){
            st.push(st2.pop());
        }
    }

    public int pop(){

        // takes O(1)
        return st.pop();
    }
    public int peek(){
        if(st.size() == 0){
            return -1;
        }
        // takes O(1)

        return st.peek();
    }
    public boolean empty(){
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
