class Solution {
    public int strStr(String haystack, String needle) {
        int k=0, r=0;
        char[] main= haystack.toCharArray();
        char[] find= needle.toCharArray();
        if(find.length == 0)
            return 0;
        if(find.length>main.length)
            return -1;
        for(k=0; k<main.length; k++) {
            if(main[k]==find[r]) {
                int mtmp=k;
                while(r<find.length && mtmp<main.length) {
                    if(main[mtmp++]!=find[r++]) {
                        r=0;
                        break;
                    }
                }
                if(r==find.length)
                    return k;
            }
        }
        return -1;
    }
}
