class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character> st = new Stack<>();
        
       st.push(s.charAt(0));
       
       for(int i=1; i<s.length(); i++){
           
           char ch = s.charAt(i);
           
           if(ch != st.peek()){
               st.push(ch);
           }
       }
           
           StringBuilder sb = new StringBuilder();
           for(char c : st){
               sb.append(c);
           }
        return sb.toString();  
       
        
    }
}