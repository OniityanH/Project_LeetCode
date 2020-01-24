/* class Solution {
    public void reverseString(char[] s) {
        char[] res = new char[s.length];
        int n = 0;
        for (int i = s.length-1; i>=0; i--){
            res[i] = s[n];
            n++;
        }
        for (int i = 0; i<s.length; i++){
            s[i] = res[i];
        }
    }
} */