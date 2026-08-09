class Solution {
    // Add all elements in Queue
    // Travel till k-1 and remove and add them from the queue
    // Remove kth element from the queue
    // Repeat tis process till q.size() == 1
    // Return peek of the queue
    // T.C => O(k*n)
    // S.C => O()
    public int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();

        for(int i =1;i<=n; i++){
            q.add(i);
        }
       while(q.size() > 1){
        for(int i =1; i<=k-1; i++ ){
            q.add(q.remove());
        }
        q.remove();
       }
    return q.peek();
    }
}