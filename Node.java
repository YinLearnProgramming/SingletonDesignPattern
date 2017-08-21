/*
 * YinHang Kwok
 * 8/18/2017
 */
public class Node 
{
	private Node next;
	private int value;
	
	public Node(int v)
	{
		this.value = v;
		this.next = null;
	}
	
	public void setValue(int v)
	{
		value = v;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public void setNext(Node n)
	{
		next = n;
	}
	
	public Node getNext()
	{
		return next;
	}
	
	public String toString()
	{
		return ("The vlaue of this node is :" + value);
	}
}
