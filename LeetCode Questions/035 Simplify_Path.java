class Solution {
    public String simplifyPath(String path) {
        String[] tokens = path.split("/+");
        Stack<String> stk = new Stack();
        for(String t: tokens) {
            if(stk.size() > 0 && "..".equals(t))
                stk.pop();
            else if(!Arrays.asList("",".").contains(t))
            stk.push(t);
            
        }
        
        StringBuilder sb = new StringBuilder();
        for(String s : stk)
            sb.append("/").append(s);
        
        return sb.toString();
    }
}
