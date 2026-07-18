// class Solution {
//     public static void reverseStack(Stack<Integer> st) {
        
//         Stack<Integer> st2 = new Stack<>();
//         while(st.size() > 0 ){
//             st2.push(st.pop());
//         }
//         Stack<Integer> st3 = new Stack<>();
        
//         while(st2.size() >0 ){
//             st3.push(st2.pop());
//         }
        
//         while(st3.size() > 0){
//             st.push(st3.pop());
//         }
        
//         // T.C & S.C = O(n)
        
//     }
// }
class Solution {
    public static void reverseStack(Stack<Integer> st) {

        Stack<Integer> temp = new Stack<>();

        while (!st.isEmpty()) {
            temp.push(st.pop());
        }

        st.addAll(temp);
    }
}