class Solution {
    public ArrayList<Integer> nextGreater(int[] arr) {
        
        int n = arr.length;
        int[] nge = new int[n];
        
        Stack<Integer> st = new Stack<>();
        
        // Push all the array elements onto the stack in reverse order
        // Check Positions of respective elements fromtop of the stack to the bottom while traversing reversly from array
        // Push next(previous element );
        // Return nge;
        
        for(int i =n-1; i>=0; i--){
            st.push(arr[i]);
        }
        for(int i = n-1; i>=0; i--){
            while(st.size() > 0 && arr[i] >= st.peek()){
                st.pop();
            }
            
            if(st.size() == 0){
                nge[i] = -1;
            }
            else{ //(arr[i] < st.peek()) adding nge of ith index element which is peek
                nge[i] = st.peek();
            }
            st.push(arr[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i =0; i<n ; i++){
            ans.add(nge[i]);
        }
        return ans;
    }
}