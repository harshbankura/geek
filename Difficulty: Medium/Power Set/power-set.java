// User function Template for Java

class Solution {
    public List<String> AllPossibleStrings(String s) {
        List<String> result = new ArrayList<>();
        work(s,0,"",result);
        Collections.sort(result);
        return result;
        // Code here
        
    }
    private void work(String s , int index , String curr , List<String> result){
        if(index==s.length()){
            if(!curr.isEmpty()){
                result.add(curr);
            }
            return;
        }
        work(s,index+1,curr+s.charAt(index),result);
        
        work(s,index+1,curr,result);
        
        
    }
}