package packageLinkedList;

public class Node {
/**
 * class Node defines an individual node of our linked list. SEC 16.3 of wu text book
 */
	
	private int item;
	private Node next;
	
	public Node()	{                       // CONSTRUCTOR
//		this(0, null);                      // sets item = 0 and next to null???
		item = 0;
		next = null;
	}
	
	public Node (int data, Node node)	{   // CONSTRUCTOR
		setItem(data);                      // setItem is a method. Adds an integer to the item field
		setNext(node);                      // setNext is a method. Adds the next node to the next field. No next node, next is null.
	}
	
	public int getItem()	{      			// getter method
		return item;
	}
	
	public Node getNext()	{				// getter method
		return next;
	}
	
	public void setItem(int data)	{		// setter method
		item = data;
	}
	
	public void setNext(Node node)	{		// setter method
		next = node;
	} 	
}


