class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        int l=n-1, r=n-1;
        String res="";
        while(s.charAt(r)==' ') r--;
        while(r>0) {
            while(s.charAt(l)!=' ') {l--;}
            res+=s.substring(l+1, r);
            res+=" ";
            r=l--;
        }
        return res;
    }
}
