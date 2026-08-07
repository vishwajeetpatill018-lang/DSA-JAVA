class MyStack {
    Queue<Integer> q = new LinkedList<>();
    public MyStack() {
        
    }

    //PUSH EFFICIENT APPROACH =>
    
    // public void push(int x) {
    //     // O(1)
    //     q.add(x);
    // }
    
    // public int pop() {

    //     // O(n) time and Space
    //     int n = q.size();
    //     for(int i=0; i<n-1; i++){
    //         q.add(q.remove());
    //     }
    //     return q.remove();
    // }
    
    // public int top() {
    //      // O(n) time and Space
    //     int n = q.size();
    //     for(int i =0; i<n-1; i++){
    //         q.add(q.remove());
    //     }
    //     int p = q.peek();
    //     q.add(q.remove());

    //     return p;
    // }
    
    public boolean empty() {
        return (q.isEmpty());
    }


    //POP EFFICIENT APPROACH

    public void push(int x){
        // I will add elements in Queue at front of the queue by remove and adding first n-1 elements

        q.add(x);
        int n = q.size();
        for(int i =0; i<n-1; i++){
            q.add(q.remove());
        }
       

    }
    public int pop(){
        return q.remove();
    }
    public int top(){
         return q.peek();
    }








}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */