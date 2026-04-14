class Solution {
    public boolean isValid(String s) {
        char[] ch = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < ch.length; i++){
            if(ch[i] == '(' || ch[i] == '[' || ch[i] == '{'){
                stack.push(ch[i]);
            }else{
                if(stack.isEmpty()){
                    return false;
                }

                char top = stack.pop();
                boolean flag = validPara(ch[i], top);
                if(!flag){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public boolean validPara(char s, char top){
        if(top == '(' && s == ')'){
            return true;
        }else if(top == '{' && s == '}'){
            return true;
        }else if(top == '[' && s == ']'){
            return true;
        }

        return false;

    }
}
