// { Driver Code Starts
#include<bits/stdc++.h>
using namespace std;


 // } Driver Code Ends
class Solution
{
    public:
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    string smallestWindow (string s, string p)
    {
        // Your code here
        int t;
        cin>>t;
        while(t--) {
        string s;
        cin>>s;
        unordered_map<char, int> m;
        set<char> st;
        for(int i=0; i<s.length(); i++) st.insert(s[i]);
        int n=st.size();
        int i=0;
        int j=1;
        m[s[i]]++;
        int c=0;
        c++;
        int mi=INT_MAX;
        while(i<j && j<s.length()) {
            if(c<n) {
                if(m[s[j]]==0)c++;
                m[s[j]]++;
                j++;
            }
            else if(c==n) {
                mi=min(mi,j-i);
                if(m[s[i]]==1) c--;
                m[s[i]]--;
                i++;
            }
        }
        while(c==n) {
            mi = min(mi, j-i);
            if(m[s[i]]==1) c--;
            m[s[i]]--;
            i++;
        }
        cout<<mi<<endl;
    }
    return 0;
    }
};

// { Driver Code Starts.
int main()
 {
    int t;
    cin>>t;
    while(t--)
    {
        string s;
        cin>>s;
        string pat;
        cin>>pat;
        Solution obj;
        cout<<obj.smallestWindow(s, pat)<<endl;
        
    }
	return 0;
}  // } Driver Code Ends
