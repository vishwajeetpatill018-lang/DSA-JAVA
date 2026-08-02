// class MinStack {
//     Stack<Integer> st;
//     Stack<Integer> minSt;
//     public MinStack() {
//         st= new Stack<>();
//         minSt = new Stack<>();
        
//     }
    
//     public void push(int val) {
//         st.push(val);
//         if(minSt.size() ==0 || val < minSt.peek()){
//             minSt.push(val);
//         }
//         else{
//             minSt.push(minSt.peek());
//         }
//     }
    
//     public void pop() {
//         if(st.size() >0)
//         st.pop();
//         minSt.pop();
//     }
    
//     public int top() {
//         return st.peek();

//     }
    
//     public int getMin() {
//         return minSt.peek();
//     }
// }
class MinStack {
    Stack<Long> st;
    Long min;

    public MinStack() {
        st = new Stack<>();
        min = Long.MAX_VALUE;
    }

    public void push(int val) {
        // ❌ Mistake: first push falls through into encoding logic
        // ✅ Fix: handle first push separately
        if(st.isEmpty()){
            st.push((long)val);
            min = (long)val;
            return;
        }

        if((long)val >= min){
            st.push((long)val);
        } else {
            // encode previous min
            st.push((long)val + ((long)val - min));
            min = (long)val;
        }
    }

    public void pop() {
        if(st.isEmpty()) return; // ✅ Fix: guard against empty stack
        if(st.peek() < min){
            // rollback previous min
            min = min + (min - st.peek());
        }
        st.pop();
    }

    public int top() {
        if(st.isEmpty()) return -1; // ✅ Fix: guard against empty stack
        if(st.peek() < min){
            // ❌ Mistake: you tried to "rollback"
            // ✅ Fix: actual top is just min
            return (int)(long)min;
        } else {
            return (int)(long)st.peek();
        }
    }

    public int getMin() {
        if(st.isEmpty()) return -1; // ✅ Fix: guard against empty stack
        return (int)(long)min;
    }
}
