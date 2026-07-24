class Solution {
    public int[] nextGreaterElements(int[] arr) {
        // int max = arr[0];
         int n = arr.length;
         int[] nge = new int[n];
         Stack<Integer> st = new Stack<>();
        // for(int i =0; i<n; i++){
        //     if(arr[i] > max){
        //         max = arr[i];
        //     }
        // }
        // st.push(max);

        // for(int i = n-1; i>=0 ; i--){
        //     while(st.size() >0 && arr[i] >= st.peek()){
        //         st.pop();
        //     }
        //     if(st.size() == 0){
        //         nge[i] = -1;
        //     }
        //     else{
        //         nge[i] = st.peek();
        //     }
        //     st.push(arr[i]);
        // }
        // return nge;

        for(int i=n-1 ; i >= 0; i--){
            st.push(arr[i]);
        }
            
        
        // Put all the elements in stack
        // 

        for(int i= n-1; i>=0; i--){
            while(st.size()>0 && arr[i] >= st.peek()){
                st.pop();
            }
            if(st.size() == 0){
                nge[i] = -1 ; // Next greater is peek
            }
            else{
                nge[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return nge;

    }
}