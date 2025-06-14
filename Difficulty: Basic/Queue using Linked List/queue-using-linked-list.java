/*The structure of the node of the queue is
class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}*/

class MyQueue
{
    QueueNode front, rear;
    
    //Function to push an element into the queue.
	void push(int a)
	{
	    QueueNode nn = new QueueNode(a);
	    if(front==null){
	        front = nn;
	        rear=nn;
	        
	    }else{
	        rear.next=nn;
	        rear=rear.next;
	    }
	    
        // Your code here
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
	    if(front==null)return -1;
	    int ans=front.data;
	    front=front.next;
	    return ans;
        // Your code here
	}
}




