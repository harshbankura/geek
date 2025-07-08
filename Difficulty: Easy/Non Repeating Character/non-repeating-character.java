class Solution {
    static char nonRepeatingChar(String s) {
        int freq[]= new int[26];
        for(char c: s.toCharArray()){
            freq[c-'a']++;
        }
        for(char c : s.toCharArray()){
            if(freq[c-'a']==1){
                return c;
            }
        }
        return '$';
        // code here
        
    }
}
