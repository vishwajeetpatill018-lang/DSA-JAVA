class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        
        // Add First half of the queue in q2
        // Add element of q2 into q
        // Remove and add first element of the q
        
        
        // Queue<Integer> q2 = new LinkedList<>();
        
        // int n = q.size();
        // for(int i=0; i<n/2; i++){
        //     q2.add(q.remove());
        // }
        
        // while(q2.size() > 0){
           
        //     q.add(q2.remove());
        //     q.add(q.remove());
        // }
        
        
        // Solving it using 2 Stacks
        
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        
        // ADD first half of the queue in st
        // Add 2nd half of queue in st2
        // Add top  of st2 to queue &  Add top of st to queue alternatively
        
        // Reverse the queue using st
        // For reversing the queue ad all elements from queue into the st
        // Add all tops of st into the queue 
        
        // int n = q.size();
        // for(int i=0; i<n/2; i++){
        //   st.push(q.remove());
        // }
        // for(int i= 0; i<n/2; i++)
        // {
        //     st2.push(q.remove());
            
        // }  
        // while(st2.size() > 0 && st.size() > 0){
        //     q.add(st2.pop());
        //     q.add(st.pop());
        // }
        // // Reverse Queue
        
        // while(q.size() > 0){
        //     st.push(q.remove());
        // }
        
        // // Add all elements from the st to the queue
        
        // while(st.size() >0){
        //     q.add(st.pop());
        // }
        
        
        
        
        
        
        
        
        // SOLVED USING ONLY ONE STACK
        
        // Add first half of the queue into the stack
        // Pop all elements of st and add into the  queue 
        // Add first half of the stack into the stack
        
        // Add top in queue & remove and add first element of the queue
        // Reverse the queue using the st
        
        int n = q.size();
        for(int i =0; i<n/2; i++){
            st.push(q.remove());
        }
        while(st.size() >0){
            q.add(st.pop());
        }
        // Now st is empty 
        // add first half of the queue into the st
        for(int i=0; i<n/2; i++){
            st.push(q.remove());
        }
        
        // Add top and remove and add from the queue simultaneously
        
        while(st.size() >0){
            q.add(st.pop());
            q.add(q.remove());
        }
        // Now reverse the queue using st
        
        while(q.size() >0){
            st.push(q.remove());
        }
        while(st.size() >0){
            q.add(st.pop());
        }
        
        
        
    }
}
