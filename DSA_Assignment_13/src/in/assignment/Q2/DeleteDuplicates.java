package in.assignment.Q2;


public class DeleteDuplicates {
	static class Node {
		int data;
		Node next;
	}
	public static void main(String[] args)
	{
		/* Start with the empty list */
		Node head = newNode(4);
		head.next = newNode(3);
		head.next.next = newNode(3);
		head.next.next.next = newNode(2);
		head.next.next.next.next = newNode(1);
		head.next.next.next.next.next = newNode(1);
		
		
		Node ans= deleteDuplicates(head);
		printList(ans);
	}
	
	static Node newNode(int data)
	{
		Node temp = new Node();
		temp.data = data;
		temp.next = null;
		return temp;
	}

	
	public static Node deleteDuplicates(Node head) 
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node p=head;
        Node c=head.next;
        Node n=c.next;
        while(c!=null)
        {
            n=c.next;
            while(c!=null && c.data==p.data)
            {
                c=n;
                if(c!=null)
                {
                    n=c.next;
                }
            }
            p.next=c;
            p=c;
            c=n;
        }
        return head;
    }
	static void printList(Node ptr)
	{
		while (ptr != null) {
			System.out.print(ptr.data + "->");
			ptr = ptr.next;
		}
		System.out.println("NULL");
	}
	
	
}


	

	

	
	


