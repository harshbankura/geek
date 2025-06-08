/* class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}*/
class Solution {
    static Node segregate(Node head) {
        if(head==null||head.next==null) return head;
        Node zeros= new Node(-1);
        Node ones=new Node(-1);
        Node twos= new Node(-1);
        Node zero=zeros, one=ones ,two =twos;
         Node curr=head;
         while(curr!=null){
             if(curr.data==0){
                 zeros.next=curr;
                 zeros=zeros.next;
             }else if(curr.data==1){
                 ones.next = curr;
                 ones=ones.next;
             }else{
                 twos.next=curr;
                 twos=twos.next;
             }
             curr=curr.next;
         }
         //merge now;
         zeros.next=(one.next!=null)?one.next:two.next;
         ones.next=two.next;
         twos.next=null;
         return zero.next;
        // code here
        
    }
}