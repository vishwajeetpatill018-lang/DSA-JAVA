class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        
        Stack<Pair> st = new Stack<>();
        
        int n = arr.length;
        int[] span = new int[n];
        span[0] = 1;
        
        Pair p = new Pair(arr[0] , 0);
        st.push(p);
        for(int i= 1; i<n; i++){
            while(st.size() >0 && st.peek().val <= arr[i]){
                st.pop();
            }
            
            if(st.size() == 0){
                span[i]  = i+1;
            }
            
            else{
                span[i] = i - st.peek().idx;
            }
            st.push(new Pair(arr[i] , i));
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i =0; i<n; i++){
            ans.add(span[i]);
        }
        
       return ans;
    }
    
}
class Pair{
    
    int val ;
    int idx ;
    Pair(int val ,  int idx){
        this.val = val;
        this.idx = idx;
    }

}