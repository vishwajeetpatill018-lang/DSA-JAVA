class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        // Add all -ve elements index into the queue
        // 
        
        
        
        int n = arr.length;
        for(int i =0; i<n; i++){
            if(arr[i] < 0){
                q.add(i);
            }
        }
        for(int i=0; i<n-k+1; i++){
            
            while(q.size() >0 && q.peek() < i)
                {
                    q.remove();
                }      
            if(q.size() > 0 && q.peek() <= i+k-1){
                ans.add(arr[q.peek()]);
            }
            else{ // there is no -ve element in current window
                ans.add(0);
            }
            
            
        }
        return ans;
        
        
        
    }
}