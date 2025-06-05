/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        Node newNode = new Node(x);
        if(head==null){
            return newNode;
        }
        Node curr= head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
        return head;
        // code here
        
    }
}