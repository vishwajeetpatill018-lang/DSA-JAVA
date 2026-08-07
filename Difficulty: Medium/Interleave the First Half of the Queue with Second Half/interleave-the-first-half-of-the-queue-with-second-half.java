class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        
        // Add First half of the queue in q2
        // Add element of q2 into q
        // Remove and add first element of the q
        
        
        Queue<Integer> q2 = new LinkedList<>();
        
        int n = q.size();
        for(int i=0; i<n/2; i++){
            q2.add(q.remove());
        }
        
        while(q2.size() > 0){
            // q.add(q2.peek());
            q.add(q2.remove());
            q.add(q.remove());
        }
        
        
        
    }
}
