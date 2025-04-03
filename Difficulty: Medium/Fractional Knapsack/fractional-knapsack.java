//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GfG {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            // Read values array
            String[] valueInput = br.readLine().trim().split(" ");
            List<Integer> values = new ArrayList<>();
            for (String s : valueInput) {
                values.add(Integer.parseInt(s));
            }

            // Read weights array
            String[] weightInput = br.readLine().trim().split(" ");
            List<Integer> weights = new ArrayList<>();
            for (String s : weightInput) {
                weights.add(Integer.parseInt(s));
            }

            // Read the knapsack capacity
            int w = Integer.parseInt(br.readLine().trim());

            // Call fractionalKnapsack function and print result
            System.out.println(String.format(
                "%.6f", new Solution().fractionalKnapsack(values, weights, w)));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    // Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(List<Integer> val, List<Integer> wt, int capacity) {
        int n= val.size();
        double[][] items = new double[n][3];
        for(int i=0;i<n;i++){
            items[i][0]=val.get(i);
            items[i][1]=wt.get(i);
            items[i][2]=(double)val.get(i)/wt.get(i);
        }
        Arrays.sort(items,(a,b)->Double.compare(b[2],a[2]));
        double total=0;
        for(double[] item:items ){
            int v=(int)item[0];
            int w=(int)item[1];
            if(capacity==0){
                return total ;
            }else if(w<=capacity){
                capacity-=w;
                total+=v;
            }else{
                total+=v*((double)capacity/w);
                break;
            }
        }
        return total;
        // code here
    }
}