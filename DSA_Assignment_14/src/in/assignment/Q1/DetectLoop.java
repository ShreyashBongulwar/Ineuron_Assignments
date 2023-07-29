package in.assignment.Q1;
public class DetectLoop {
	static class Node {
		int data;
		Node next;
	}
	public static void main(String[] args)
	{
		/* Start with the empty list */
		Node head = newNode(1);
		head.next = newNode(2);
		head.next.next = newNode(3);
		head.next.next.next = newNode(4);
		head.next.next.next.next = head;
		
		Boolean ans= hasCycle(head);
		System.out.println(ans);
	}
	
	static Node newNode(int data)
	{
		Node temp = new Node();
		temp.data = data;
		temp.next = null;
		return temp;
	}

	
	public static boolean hasCycle(Node head) 
    {
        if(head==null || head.next==null)
        {
            return false;
        }
        
        if(head.next == head) return true;
        
        Node temp1=head;
        Node temp2=head;
        
        while(temp2!=null && temp2.next!=null)
        {
            temp1=temp1.next;
            temp2=temp2.next.next;
            if(temp1==temp2)
            {
                return true;
            }
        }
        
        return false;
    }
	
	
	
}


	

	

	
	


