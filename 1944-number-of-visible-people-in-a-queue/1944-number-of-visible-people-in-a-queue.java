class Solution {
    public int[] canSeePersonsCount(int[] arr) {

        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        ans[n-1] = 0;
        for(int i = n-2; i>=0; i--){

            int count = 0;

            while(st.size()>0 && st.peek() <= arr[i]){
                st.pop();
                count += 1;
            }
            if(st.size() > 0){
                count++;
            }
            ans[i] = count;
            st.push(arr[i]);// For next checking 
        }
        return ans;
    }
}