
public class SingleList 
{
	private Node first;
	private Node tail;
	
	public SingleList()
	{
		first = null;
		tail = null;
	}
	/*
	 * @return boolean - if list is null then true. list is not null then false.
	 */
	public boolean isEmpty()
	{
		return (first == null);//if first is null then return 
	}
	 
	public void addFront(int v)
	{
		Node temp = new Node(v);//create a new Node object
		
		if(first == null)//if the list is empty
		{
			first = temp;
			tail = temp;
		}
		else
		{
			
			temp.setNext(first);
			first = temp;
		}
	}
	
	public void deleteByValue(int v)
	{
		Node curr = first;
		if(isEmpty())
		{
			System.out.println("The link is empty!");
		}
		else
		{
			while(curr.getNext() != null)
			{
				if(curr.getValue() == v)
				{
					curr.setNext(curr.getNext().getNext());
				}
				curr = curr.getNext();
			}
		}
	}
	
	public Node reverseList(Node head)
	{
		if(isEmpty())
		{
			return null;
		}
		else
		{
			Node rever = reverseList(head.getNext());
			rever.setNext(head);
			return head;
		}
	}
}
