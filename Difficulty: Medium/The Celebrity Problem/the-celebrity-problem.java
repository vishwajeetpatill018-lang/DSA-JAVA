class Solution {
    public int celebrity(int arr[][]) {
       
       // IDEA :
       // Ignore diagonal values because each person knows themselves
        // Push all people onto the stack in any order
        // Check first 2 persons if they know each other(top and second top)
        // If stack is empty : No celebrity exists
        // If stack.size() ==1 : check its row and column .All elements form row should be 0 and column should be 1
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        
        for(int i =0; i<n; i++){
            st.push(i);
        }
        while(st.size() > 1){
            int a = st.pop();
            int b = st.pop();
        
        boolean aFlag = true;
        boolean bFlag = true;
        
        if(arr[a][b] == 1){// a is not celeb{
            aFlag = false;
        }
        
        else //(arr[b][a] == 1 && arr[a][b] == 0) // b is not celeb
        {
           bFlag = false;
        }
        if(aFlag) {
            st.push(a);
        }
        if(bFlag) {
            st.push(b);
        }
        }
        
        if(st.size() == 0){
            // No celebrity
            return -1;
        }
        else{
            int ele = st.pop();
            for(int j = 0; j<n; j++){
                if(j == ele) continue;
                if(arr[ele][j] == 1) 
                {
                    return -1;
                }
            }
            for(int i =0; i<n; i++){
                if(i == ele) continue;
                if(arr[i][ele] == 0){
                    return -1;
                }
            }
             
        
        return ele;
        
            
        // wrriten for understanding purpose only =>
        // else{ // arr[a][b]== 0 then => b is not celeb
            
        // }
        // if(arr[b][a] ==1) // then b is not celeb
        // else{// arr[b][a] ==0 => a is not celeb
        
        }
            
        }
}