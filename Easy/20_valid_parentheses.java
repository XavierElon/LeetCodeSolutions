class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        
        Stack<Character> stack = new Stack<Character>();
        
        for (int i = 0; i < s.length(); i++) {
            char current_char = s.charAt(i);
            
            if (current_char == '(' || current_char == '{' || current_char == '[') {
                stack.push(current_char);
            } else {
                if (stack.size() == 0) return false;
                char top_char = stack.pop();
                if (current_char == ')' && top_char != '(') return false;
                else if (current_char == '}' && top_char != '{') return false;
                else if (current_char == ']' && top_char != '[') return false;
            }
        }
        return (stack.size() == 0);
    }
}
