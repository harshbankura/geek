/*

Definition for doubly Link List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node deleteNode(Node head, int x) {
        if(x==1){
            head.next.prev=null;
            head=head.next;
            return head;
        }
        int count=1;
        Node curr=head;
        while(count<x&&curr!=null){
            curr=curr.next;
            count++;
        }
        if(curr!=null){
            curr.prev.next=curr.next;
            if(curr.next!=null){
                curr.next.prev=curr.prev;
            }
        }
        return head;
        // code here
        
    }
}