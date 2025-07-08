class Solution {
    public String FirstNonRepeating(String s) {
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        
        for(char c : s.toCharArray()){
            freq[c-'a']++;
            q.offer(c);
            while(!q.isEmpty()&& freq[q.peek()-'a']>1){
                q.poll();
            }
            if(!q.isEmpty()){
                sb.append(q.peek());
            }else{
                sb.append('#');
            }
        }
        return sb.toString();
        // code here
        
    }
}