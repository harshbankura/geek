/* Structure of Doubly Linked List
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}*/

class Solution {
    // Function to insert a new node at given position in doubly linked list.
    Node addNode(Node head, int p, int x) {
        int count=0;
        Node curr = head;
        Node newNode = new Node(x);
        while(count<p&&curr!=null){
            curr=curr.next;
            count++;
        }
        Node nextNode=curr.next;
        newNode.prev=curr;
        if (nextNode != null) {
            nextNode.prev = newNode;
        }
        curr.next=newNode;
        newNode.next=nextNode;
        return head;
        
        // Your code here
        
    }
}