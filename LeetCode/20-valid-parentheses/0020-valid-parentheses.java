class Solution {
    public boolean isValid(String s) {
        // when we encounter open brackets, push it to the stack
        // else, pop from the stack and compare if close bracket has a corresponding open bracket of the same type.
        
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == ')' || curr == '}' || curr == ']') {
                if (stack.size() > 0) {
                    char openBracket = stack.pop();
                    if (curr == ')') {
                        if (openBracket != '(') {
                            return false;
                        }
                    } else if (curr == '}') {
                        if (openBracket != '{') {
                            return false;
                        }
                    } else {
                        if (openBracket != '[') {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            } else {
                stack.push(curr);
            }
        }
        return stack.size() == 0;
    }
}