public String removeDuplicates(String S) {
         Stack<Character> stack = new Stack<>();
        int N = S.length();
        
        for (int i = 0; i < N; i++){
            if (!stack.isEmpty() && S.charAt(i) == stack.peek()){
                stack.pop();
            }else{
                stack.push(S.charAt(i));
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        
        return sb.reverse().toString();
    }
