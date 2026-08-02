class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        
        
        // BAse Case :
        if(st.isEmpty()){
            st.push(x);
            return st;
        }
       int top = st.pop();
       
       insertAtBottom(st, x);
       st.push(top);
       
        return st;
    }

   
    
}