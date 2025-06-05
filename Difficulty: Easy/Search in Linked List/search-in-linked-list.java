// User function Template for Java

/* Node of a linked list
  class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/
class Solution {
    static boolean searchKey(int n, Node head, int key) {
        Node curr=head;
        while(curr!=null){
            if(curr.data==key)return true;
            curr=curr.next;
        }
        return false;
        // Code here
        
    }
}