class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        
        // Push elements till k in Stack
        // Add them into the  queue
        // Add n-k elements to the queue (At rear)
        
        // if k>q.size()
        if(k > q.size()){
            return q;
        }
        
        Stack<Integer> st = new Stack<>();
        int n = q.size();
       for(int i = 0; i<k; i++){
           st.push(q.remove());
       }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
       for(int i =0; i<n-k ; i++){
           q.add(q.remove());
       }
        return q;
    }
}