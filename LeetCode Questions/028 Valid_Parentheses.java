class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<Character>();
        char[] ck = s.toCharArray();
        for(char a: ck) {
            if(a=='(' || a=='{' || a=='[')
                stk.push(a);
            else {
                if(stk.empty() && (a==')' || a==']' || a=='}'))
                    return false;
                char x=stk.pop();
                if((x=='(' && a!=')'))
                    return false;
                if((x=='[' && a!=']'))
                    return false;
                if((x=='{' && a!='}'))
                    return false;
            }     
        }
        if(stk.empty())
        return true;
        return false;
    }
}
