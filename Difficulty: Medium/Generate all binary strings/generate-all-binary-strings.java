// User function Template for Java

class Solution {
    public static List<String> generateBinaryStrings(int n) {
        
        List<String> ans = new ArrayList<>();
        work(n,0,"",ans);
        return ans;
        // code here
        
    }
    private static void work(int n , int last , String s ,List<String> ans ){
        if(n==0){
            ans.add(s);
            return;
        }
        work(n-1,0,s+"0",ans);
        if(last==0){
            work(n-1,1,s+"1",ans);
        }
    }
}
